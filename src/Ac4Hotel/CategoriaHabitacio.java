package Ac4Hotel;

public enum CategoriaHabitacio {
    SUPERLUXE(200), LUXE(100), NORMAL(60);

    private final int preu;

    CategoriaHabitacio(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }
}
