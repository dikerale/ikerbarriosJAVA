package Ac3Banc;

public class Compte {

    private String numeroCompte;
    private Titular titular;
    private double saldo;

    public Compte(String numeroCompte, Titular titular, double saldoInicial) {
        this.numeroCompte = numeroCompte;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public Compte(String numeroCompte, Titular titular) {
        this(numeroCompte, titular, 0);  // Si no s'especifica saldo, es crea amb 0€
    }

    public void ingressar(double quantitat) {
        if (quantitat > 0) {
            saldo += quantitat;
        }
    }

    public void retirar(double quantitat) {
        try {
            if (quantitat > saldo) {
                throw new Exception("Error: No hi ha saldo suficient!");
            }
            saldo -= quantitat;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public Titular getTitular() {
        return titular;
    }

    public String toString() {
        return "Compte: " + numeroCompte + ", Titular: " + titular + ", Saldo: " + saldo + "€";
    }
}
