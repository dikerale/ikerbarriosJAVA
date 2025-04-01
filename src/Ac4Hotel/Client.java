package Ac4Hotel;

public class Client {
    private String nom;
    private String dni;
    private String numTargeta;

    public Client(String nom, String dni, String numTargeta) {
        this.nom = nom;
        this.dni = dni;
        this.numTargeta = numTargeta;
    }

    @Override
    public String toString() {
        return "Client: " + nom + " (" + dni + ")";
    }
}
