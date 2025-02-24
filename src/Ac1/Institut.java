package Ac1;

public class Institut {
        private String nom;
        private int numAlumnes;
        private Alumne[] llistaAlumne;

    public Institut(String nom) {
        this.nom = nom;
        this.numAlumnes = 0;
        this.llistaAlumne = new Alumne[100];
    }

    public Institut(String nom, int maxAlumnes) {
        this.nom = nom;
        this.numAlumnes = 0;
        this.llistaAlumne = new Alumne[maxAlumnes];
    }
    public void afegirAlumne(Alumne a1) {
        if (numAlumnes < llistaAlumne.length) {
            llistaAlumne[numAlumnes] = a1;
            numAlumnes++;
        }
        else {
            System.out.println("Aquest alumne no es es pot introduir" + nom);
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAlumnes() {
        return numAlumnes;
    }

    public void setNumAlumnes(int numAlumnes) {
        this.numAlumnes = numAlumnes;
    }

    public Alumne[] getLlistaAlumne() {
        return llistaAlumne;
    }

    public void setLlistaAlumne(Alumne[] llistaAlumne) {
        this.llistaAlumne = llistaAlumne;
    }
}
