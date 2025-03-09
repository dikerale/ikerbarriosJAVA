package Ac3Banc;

public class Titular {
        private String dni;
        private String nom;
        private String cognoms;

        public Titular(String dni, String nom, String cognoms) {
            this.dni = dni;
            this.nom = nom;
            this.cognoms = cognoms;
        }

        public String getDni() {
            return dni;
        }

        public String toString() {
            return dni + " - " + nom + " " + cognoms;
        }
}
