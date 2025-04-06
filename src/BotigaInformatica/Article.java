package BotigaInformatica;

public abstract class Article {
    protected String codi;
    protected String descripcio;
    protected int unitats;
    protected float preuBase;

    public Article(String codi, String descripcio, int unitats, float preuBase) {
        this.codi = codi;
        this.descripcio = descripcio;
        this.unitats = unitats;
        this.preuBase = preuBase;
    }

    public String getCodi() {
        return codi;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public int getUnitats() {
        return unitats;
    }

    public float getPreuBase() {
        return preuBase;
    }

    @Override
    public String toString() {
        return "Article{" +
                "codi='" + codi + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", unitats=" + unitats +
                ", preuBase=" + preuBase +
                '}';
    }
    public abstract float preu();

}
