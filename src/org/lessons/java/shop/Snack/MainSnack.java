package org.lessons.java.shop;

import java.math.BigDecimal;
//importo lo scanner per leggere gli input dalla console
import java.util.Scanner;

public class MainSnack {
    public static void main(String[] args) {
        // SNACK 1: studente
        Studente giovanni = new Studente("Giovanni", "Rossi", 20);
        Studente luca = new Studente("Luca", "Verdi", 30);
        // con il metodo con il return, si possono salvare i dati in una variabile
        // con il void non è possibile
        String datiStudente = giovanni.datiStudente();
        System.out.println(datiStudente);

        // SNACK 2: contoBancario
        ContoBancario contoGiovanni = new ContoBancario(123456789);

        // scanner
        Scanner scanner = new Scanner(System.in);

        // deposito
        System.out.print("Quanto vuoi depositare? ");
        BigDecimal deposito = scanner.nextBigDecimal();
        contoGiovanni.deposito(deposito);

        // prelievo
        System.out.print("Quanto vuoi prelevare? ");
        BigDecimal prelievo = scanner.nextBigDecimal();
        contoGiovanni.prelievo(prelievo);

        // saldo corrente
        System.out.println(contoGiovanni.saldoCorrente());

        // chiusura scanner
        scanner.close();

        // SNACK 3
        RegistroStudenti registro = new RegistroStudenti();
        System.out.println(registro);

        // c'è sopra giovanni (snack 1)
        registro.nuovoStudente(giovanni);
        registro.nuovoStudente(luca);
        System.out.println(registro.toString());
    }
}
