package Ac4Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Gran Hotel", 5);
        hotel.afegirHabitacio(new Habitacio(1, CategoriaHabitacio.SUPERLUXE, 2));
        hotel.afegirHabitacio(new Habitacio(2, CategoriaHabitacio.LUXE, 3));
        hotel.afegirHabitacio(new Habitacio(3, CategoriaHabitacio.NORMAL, 1));

        Client client = new Client("Iker", "12345678A", "1111-2222-3333-4444");
        Reserva reserva = hotel.ferReserva(client, 1, 3);

        System.out.println(hotel);
        System.out.println(reserva);
    }
}
