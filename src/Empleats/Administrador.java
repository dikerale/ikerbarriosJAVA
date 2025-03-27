package Empleats;

public class Administrador extends EmpleatTecnic {

    public Administrador(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }
    public void treballar() {
        System.out.println("Soc un administrador de sistemes i gestiono els servidors i la xarxa.\n");
    }
}
