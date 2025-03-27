package Empleats;

public class EmpleatTecnic extends Empleat {

    public EmpleatTecnic(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }
    @Override
    public void treballar() {
        System.out.println();
    }
}
