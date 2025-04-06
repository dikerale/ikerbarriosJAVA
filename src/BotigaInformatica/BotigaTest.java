package BotigaInformatica;

public class BotigaTest {

    public static void main(String[] args) {

        DiscDur dd1 = new DiscDur("dd1", "Disc Dur 1", 40, 1.5f, 100);

        DiscDur dd2 = new DiscDur("dd2", "Disc Dur 2", 22, 1f, 150);

        DiscDur dd3 = new DiscDur("dd3", "Disc Dur 3", 11, 2f, 100);

        Cpu cpu1 = new Cpu("cpu1", "Processador 1", 35, 0.05f, 2500);

        Cpu cpu2 = new Cpu("cpu2", "Processador 2", 10, 0.07f, 2800);

        Botiga botiga = new Botiga();

        botiga.afegirArticle(dd1);

        botiga.afegirArticle(cpu1);

        botiga.afegirArticle(dd2);

        botiga.afegirArticle(dd3);

        botiga.afegirArticle(cpu2);

        botiga.llistarEstoc();


    }
}