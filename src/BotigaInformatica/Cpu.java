package BotigaInformatica;

public class Cpu extends Article {
    private float velocitat;

    public Cpu(String codi, String descripcio, int unitats, float velocitat, float preuBase) {
        super(codi, descripcio, unitats, preuBase);
        this.velocitat = velocitat;
    }
    float getVelocitat() {
        return velocitat;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "velocitat=" + velocitat +
                ", codi='" + codi + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", unitats=" + unitats +
                ", preuBase=" + preuBase +
                '}';
    }
    public float preu() {
        return preuBase * velocitat;
    }
}
