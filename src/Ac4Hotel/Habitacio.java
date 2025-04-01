package Ac4Hotel;

public class Habitacio {
    public int idHabitacio;
    private CategoriaHabitacio categoria;
    private int llits;
    public boolean disponible;

    public Habitacio(int idHabitacio, CategoriaHabitacio categoria, int llits) {
        this.idHabitacio = idHabitacio;
        this.categoria = categoria;
        this.llits = llits;
        this.disponible = true;
    }

    public void ocupar() {
        this.disponible = false;
    }

    public void alliberar() {
        this.disponible = true;
    }

    public int obtenirPreu() {
        return categoria.getPreu();
    }

    @Override
    public String toString() {
        return "Habitació " + idHabitacio + " (" + categoria + ", " + llits + " llits) - " + (disponible ? "Disponible" : "Ocupada");
    }
}
