package Ac1;

public class UsaInstitut {
    public static void main(String[] args) {
        Institut institut1 = new Institut("Claret");
        Institut institut2 = new Institut("JH", 50);


        Alumne alumne1 = new Alumne("iker", 18, "674315231", "i@gmail.com");
        Alumne alumne2 = new Alumne("aleix", 18, "67431556", "a@gmail.com");
        Alumne alumne3 = new Alumne("eric", 18, "67431589", "e@gmail.com");
        Alumne alumne4 = new Alumne("lluc", 18, "67431512", "ll@gmail.com");
        Alumne alumne5 = new Alumne("fabio", 18, "67431578", "f@gmail.com");
        Alumne alumne6 = new Alumne("yassine", 18, "67431521", "y@gmail.com");

        institut1.afegirAlumne(alumne1);
        institut1.afegirAlumne(alumne2);
        institut1.afegirAlumne(alumne3);

        institut2.afegirAlumne(alumne4);
        institut2.afegirAlumne(alumne5);
        institut2.afegirAlumne(alumne6);

        System.out.println("Alumnes de l'Institut " + institut1+ ":");
        for (Alumne al : institut1) {
            System.out.println(al.getNom());
        }

        System.out.println("Alumnes de l'Institut " + institut2+ ":");
        for (Alumne al : institut2) {
            System.out.println(al.getNom());
        }
    }
}
