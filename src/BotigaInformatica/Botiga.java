package BotigaInformatica;

import java.util.ArrayList;

public class Botiga {
    ArrayList<Article> estoc;

    public Botiga() {
        estoc = new ArrayList<>();
    }
    public boolean afegirArticle(Article a) {
        return estoc.add(a);
    }
    public boolean esborrarArticle(Article a) {
        return estoc.remove(a);
    }
    public void llistarEstoc() {
        System.out.println("-------------------------------");
        for (Article a : estoc) {
            System.out.println(a);
        }

    }
    public float valorEstoc() {
        System.out.println("Valor total de l'estoc: " + estoc.size());
        return estoc.size();
    }
}
