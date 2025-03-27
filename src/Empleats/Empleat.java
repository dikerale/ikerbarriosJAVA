package Empleats;

import java.util.ArrayList;

public class Empleat {
    protected String nom;
    protected int edat;
    protected float salariBase;

    public Empleat(String nom, int edat, float salariBase) {
        this.nom = nom;
        this.edat = edat;
        this.salariBase = salariBase;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public float getSalariBase() {
        return salariBase;
    }

    public void setSalariBase(float salariBase) {
        this.salariBase = salariBase;
    }


    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", salariBase=" + salariBase +
                '}';
    }
    public void treballar() {
        System.out.println();
    }
    public void pagarSou() {
        System.out.println(nom + " ha cobrat " + salariBase + " euros ");
    }
    public void pagarSou(float extra) {
        System.out.println(nom + " ha cobrat " + (salariBase + extra) + " euros ");
    }
    public void augmentarSou(float augment) {
        salariBase += augment;
        System.out.println(nom + " ha cobrat " + (salariBase + augment) + " euros ");
    }

}
