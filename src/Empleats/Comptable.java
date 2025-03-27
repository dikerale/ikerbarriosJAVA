package Empleats;

import java.util.ArrayList;

public class Comptable extends EmpleatOficina {

    public Comptable(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }
    public void treballar() {
        System.out.println("Soc un comptable i gestiono els comptes i pressupostos.\n");
    }
}
