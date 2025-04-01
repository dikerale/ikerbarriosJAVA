package Ac4Hotel;

public class Reserva {
    private int idReserva;
    private Client client;
    private Habitacio habitacio;
    private int dies;
    private int preuTotal;

    public Reserva(int idReserva, Client client, Habitacio habitacio, int dies) {
        this.idReserva = idReserva;
        this.client = client;
        this.habitacio = habitacio;
        this.dies = dies;
        this.preuTotal = habitacio.obtenirPreu() * dies;
        habitacio.ocupar();
    }

    @Override
    public String toString() {
        return "Reserva " + idReserva + ": " + client.toString() + " a " + habitacio.toString() + " per " + dies + " nits - " + preuTotal + "€";
    }
}
