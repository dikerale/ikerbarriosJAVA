package Empleats;

import java.util.ArrayList;

public class EmpleatOficina extends Empleat {
    public EmpleatOficina(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }

    @Override
    public String toString() {
        return "EmpleatOficina{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat
                ;
    }
    @Override
    public void treballar() {
        System.out.println("Soc un empleat d'oficina i faig tasques administratives.\n ");
    }
}
