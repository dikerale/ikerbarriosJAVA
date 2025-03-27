package Empleats;

public class Secretari extends EmpleatOficina {

    public Secretari(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }
    public void treballar() {
        System.out.println("Soc un secretari i gestiono reunions i documents.\n");
    }
}
