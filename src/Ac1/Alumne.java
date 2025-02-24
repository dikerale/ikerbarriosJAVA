package Ac1;

public class Alumne {
    private String nom;
    private int edat;
    private String dni;
    private String email;

    public Alumne(String nom, int edat, String dni, String email) {
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
        this.email = email;
    }

    public String toString() {
        return nom + " " + edat + " " + dni + " " + email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
