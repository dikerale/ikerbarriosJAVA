package Ac3Banc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Titular juan = new Titular("44556677K", "Juan", "Garcia Martínez");
        Titular pedro = new Titular("44556678L", "Pedro", "Lorca Benítez");
        Titular ana = new Titular("44556679J", "Ana", "Torres Garriga");


        Banc bbva = new Banc("BBVA");


        bbva.afegirCompte(new Compte("435-0-2367800", juan));
        bbva.afegirCompte(new Compte("435-0-2367805", juan, 3000));
        bbva.afegirCompte(new Compte("207-1-0004572", pedro, 8200));
        bbva.afegirCompte(new Compte("207-1-0004573", ana, 100));


        System.out.println(bbva);


        Compte compteJuan = bbva.trobarCompte("435-0-2367800");
        if (compteJuan != null) compteJuan.ingressar(2000);


        Compte compteAna = bbva.trobarCompte("207-1-0004573");
        if (compteAna != null) compteAna.retirar(1000);


        System.out.println(bbva);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Introdueix el teu DNI (o escriu 'sortir' per acabar): ");
            String dni = scanner.nextLine();
            if (dni.equalsIgnoreCase("sortir")) break;

            System.out.println("Operacions disponibles:");
            System.out.println("1. Veure saldo");
            System.out.println("2. Ingressar diners");
            System.out.println("3. Treure diners");
            System.out.println("4. Tornar a introduir DNI");

            int opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    bbva.mostrarComptesTitular(dni);
                    break;
                case 2:
                    System.out.print("Número de compte: ");
                    String compteIngressar = scanner.nextLine();
                    System.out.print("Quantitat a ingressar: ");
                    double quantitatIngressar = scanner.nextDouble();
                    bbva.trobarCompte(compteIngressar).ingressar(quantitatIngressar);
                    break;
                case 3:
                    System.out.print("Número de compte: ");
                    String compteTreure = scanner.nextLine();
                    System.out.print("Quantitat a treure: ");
                    double quantitatTreure = scanner.nextDouble();
                    bbva.trobarCompte(compteTreure).retirar(quantitatTreure);
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }

        scanner.close();
        System.out.println("Gràcies per utilitzar el caixer!");
    }
}
