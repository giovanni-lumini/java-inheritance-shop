package org.lessons.java.shop;

//scanner per input da console
import java.util.Scanner;

//bigdecimal per prezzi
import java.math.BigDecimal;

public class Carrello {

    public static void main(String[] args) {
        // fa riferimento alla classe Prodotto del file Prodotto.java
        // Prodotto è il nome della classe e l'array di nome prodotti conterrà oggetti
        // di tipo Prodotto e/o sue sottoclassi
        Prodotto[] prodotti = new Prodotto[3];

        // scanner
        Scanner input = new Scanner(System.in);

        // ciclo for per i prodotti inseriti dall'utente, fino a che non si raggiunge il
        // massimo di prodotti [impostati su 3] nel carrello
        for (int i = 0; i < prodotti.length; i++) {

            System.out.println("Puoi inserire nel carrello solo 3 prodotti");

            // nome, marca, prezzo e categoria sono generici, vengono sempre chiesti

            // nome
            System.out.println("Nome del prodotto:");
            String nome = input.nextLine();

            // marca
            System.out.println("Marca del prodotto:");
            String marca = input.nextLine();

            // prezzo
            System.out.println("Prezzo del prodotto (senza iva):");
            // l'input non legge il BigDecimal
            String prezzoString = input.nextLine();
            BigDecimal prezzo = new BigDecimal(prezzoString);

            // categoria per lo switch di dopo
            System.out.println("La categoria è tv, smartphone o cuffie?:");
            String categoria = input.nextLine();

            // in base alla categoria scelta, verranno chieste le altre informazioni
            // inerenti a quel prodotto

            // switch
            switch (categoria.toLowerCase()) {
                case "tv":
                    // dimensione
                    System.out.println("dimensione della tv in pollici:");
                    // converte la stringa i nun intero
                    String dimensione = input.nextLine();

                    // smart
                    System.out.println("la tv è smart? inserisci TRUE o FALSE");
                    boolean smart = Boolean.parseBoolean(input.nextLine());

                    // crea tv con i parametri del costruttore 2 di Televisori.java
                    Televisori sonyTv = new Televisori(nome, marca, prezzo, dimensione, smart);

                    // a seconda del ciclo, sonyTv prenderà l'indice dell'array
                    prodotti[i] = sonyTv;

                    break;

                case "smartphone":
                    // memoria
                    System.out.println("memoria in giga:");
                    // con input.nextLine() non si avranno problemi quando c'è da leggere l'input
                    int memoria = Integer.parseInt(input.nextLine());

                    // codiceImei
                    System.out.println("codiceImei:");
                    // con input.nextLine() non si avranno problemi quando c'è da leggere l'input
                    long codiceImei = Long.parseLong(input.nextLine());

                    // crea smartphone con i parametri del costruttore 2 di Smartphone.java
                    Smartphone nothingSmartphone = new Smartphone(nome, marca, prezzo, codiceImei, memoria);

                    // a seconda del ciclo, nothingSmartphone prenderà l'indice dell'array
                    prodotti[i] = nothingSmartphone;

                    break;

                case "cuffie":
                    // colore
                    System.out.println("colore:");
                    String colore = input.nextLine();

                    // wireless
                    System.out.println("le cuffie sono wireless? inserisci TRUE o FALSE");
                    boolean wireless = Boolean.parseBoolean(input.nextLine());

                    // crea smartphone con i parametri del costruttore 2 di Smartphone.java
                    Cuffie wescCuffie = new Cuffie(nome, marca, prezzo, colore, wireless);

                    // a seconda del ciclo, wescCuffie prenderà l'indice dell'array
                    prodotti[i] = wescCuffie;

                    break;
            }
            // linea che separa i prodotti inseriti
            System.out.println("----------------------------");
        }
        // chiusura degli input
        input.close();

        // riepilogo carrello
        System.out.println("Il tuo carrello:");

        // ciclo for per mostrare il riepilogo dei prodotti inseriti nel carrello
        for (int i = 0; i < prodotti.length; i++) {
            // stampa il nome dei prodotti inseriti
            System.out.println(prodotti[i].getNome());
            // linea che separa i prodotti inseriti nel riepilogo del carrello
            System.out.println("----------------------------");
        }
    }
}
