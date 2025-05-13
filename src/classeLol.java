import java.sql.*;

import static javax.management.remote.JMXConnectorFactory.connect;

public class classeLol {

    public static void llistarCampions() {
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, title, tags FROM champions")) {

            System.out.println("----- LLISTAT DE CAMPIONS -----");
            while (rs.next()) {
                System.out.printf("ID: %d | Nom: %s | Títol: %s | Tags: %s%n",
                        rs.getInt("id"), rs.getString("name"), rs.getString("title"), rs.getString("tags"));
            }

        } catch (SQLException e) {
            System.out.println("Error a llistar campions: " + e.getMessage());
        }
    }

    private static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ikerJava";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);

    }
    public static void veureCampio(String input) {
        // el \\d serveix per poder identificar si es un numero enter
        String query = input.matches("\\d+") ?
                "SELECT * FROM champions WHERE id = ?" :
                "SELECT * FROM champions WHERE name LIKE ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            // poder buscar per id o per nom
            if (input.matches("\\d+")) { //
                pstmt.setInt(1, Integer.parseInt(input));
            } else {
                pstmt.setString(1, "%" + input + "%");
            }

            ResultSet rs = pstmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.printf("Nom: %s | Títol: %s | Tags: %s%nLore: %s%n%n",
                        rs.getString("name"), rs.getString("title"), rs.getString("tags"), rs.getString("lore"));
            }

            if (!found) {
                System.out.println("Campió no trobat.");
            }

        } catch (SQLException e) {
            System.out.println("Error a veure campió: " + e.getMessage());
        }
    }

    public static void afegirCampio(String name, String title, String tags, String lore) {
        try (Connection conn = connect()) {
            // Comprovar duplicat
            PreparedStatement check = conn.prepareStatement("SELECT * FROM champions WHERE name = ?");
            check.setString(1, name);
            if (check.executeQuery().next()) {
                System.out.println("Ja existeix un campió amb aquest nom.");
                return;
            }

            // Obtenir el següent ID disponible
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(id) AS max_id FROM champions");
            int nextId = 1;
            if (rs.next()) {
                nextId = rs.getInt("max_id") + 1;
            }

            // Inserir campió amb id manual
            PreparedStatement insert = conn.prepareStatement( // utilitzo el prepareStatment per poder protegir les meves dades de malware o coses que vinguin del tema software.
                    "INSERT INTO champions (id, name, title, tags, lore) VALUES (?, ?, ?, ?, ?)");
            insert.setInt(1, nextId);
            insert.setString(2, name);
            insert.setString(3, title);
            insert.setString(4, tags);
            insert.setString(5, lore);
            insert.executeUpdate();

            System.out.println("Campió afegit correctament.");

        } catch (SQLException e) {
            System.out.println("Error a afegir campió: " + e.getMessage());
        }
    }

}
