package Empleats;

public class Programador extends EmpleatTecnic {
    public Programador(String nom, int edat, float salariBase) {
        super(nom, edat, salariBase);
    }
    public void treballar() {
        System.out.println("Soc un programador i escric codi i desenvolupo aplicacions.\n");
    }
}
