package BotigaInformatica;

public class DiscDur extends Article {
    private float capacitat;

    public DiscDur(String codi, String descripcio, int unitats, float capacitat, float preuBase) {
        super(codi, descripcio, unitats, preuBase);
        this.capacitat = capacitat;
    }
    float getCapacitat() {
        return capacitat;
    }

    @Override
    public String toString() {
        return "DiscDur{" +
                "capacitat=" + capacitat +
                ", codi='" + codi + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", unitats=" + unitats +
                ", preuBase=" + preuBase +
                '}';
    }
    public float preu() {
        return capacitat;
    }
}
