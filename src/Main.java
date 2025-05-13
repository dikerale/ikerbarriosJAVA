import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sortir = false;
        // crecio menu
        while (!sortir) {
            System.out.println("\nMENU:");
            System.out.println("1. Llistar campions");
            System.out.println("2. Veure campió");
            System.out.println("3. Afegir campió");
            System.out.println("4. Sortir");
            System.out.print("Opció: ");
            String opcio = scanner.nextLine();
        // amb les diferentes opcions i diferents funcions
            switch (opcio) {
                case "1":
                    classeLol.llistarCampions();
                    break;
                case "2":
                    System.out.print("Introdueix ID o nom del campió: ");
                    classeLol.veureCampio(scanner.nextLine());
                    break;
                case "3":
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Títol: ");
                    String titol = scanner.nextLine();
                    System.out.print("Tags (separats per comes): ");
                    String tags = scanner.nextLine();
                    System.out.print("Lore: ");
                    String lore = scanner.nextLine();
                    classeLol.afegirCampio(nom, titol, tags, lore);
                    break;
                case "4":
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }

        scanner.close();
    }
}

