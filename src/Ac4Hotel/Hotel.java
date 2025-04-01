package Ac4Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nom;
    private int estrelles;
    private List<Habitacio> habitacions;
    private List<Reserva> reserves;

    public Hotel(String nom, int estrelles) {
        this.nom = nom;
        this.estrelles = estrelles;
        this.habitacions = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void afegirHabitacio(Habitacio habitacio) {
        habitacions.add(habitacio);
    }

    public List<Habitacio> veureHabitacionsDisponibles() {
        List<Habitacio> disponibles = new ArrayList<>();
        for (Habitacio hab : habitacions) {
            if (hab.disponible) {
                disponibles.add(hab);
            }
        }
        return disponibles;
    }

    public Reserva ferReserva(Client client, int idHabitacio, int dies) {
        for (Habitacio habitacio : habitacions) {
            if (habitacio.idHabitacio == idHabitacio && habitacio.disponible) {
                Reserva reserva = new Reserva(reserves.size() + 1, client, habitacio, dies);
                reserves.add(reserva);
                return reserva;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Hotel " + nom + " (" + estrelles + "★) - " + habitacions.size() + " habitacions";
    }
}
