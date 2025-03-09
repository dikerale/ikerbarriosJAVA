package Ac3Banc;

import java.util.ArrayList;
import java.util.List;

public class Banc {
    private String nom;
    private List<Compte> comptes;

    public Banc(String nom) {
        this.nom = nom;
        this.comptes = new ArrayList<>();
    }

    public void afegirCompte(Compte compte) {
        comptes.add(compte);
    }

    public void mostrarComptesTitular(String dni) {
        System.out.println("Comptes del titular amb DNI: " + dni);
        for (Compte c : comptes) {
            if (c.getTitular().getDni().equals(dni)) {
                System.out.println(c);
            }
        }
    }

    public Compte trobarCompte(String numeroCompte) {
        for (Compte c : comptes) {
            if (c.getNumeroCompte().equals(numeroCompte)) {
                return c;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder info = new StringBuilder("Banc: " + nom + "\n");
        for (Compte c : comptes) {
            info.append(c).append("\n");
        }
        return info.toString();
    }
}
