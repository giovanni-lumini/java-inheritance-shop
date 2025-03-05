package org.lessons.java.shop;

//decimali per valiute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;

public class Main {
        public static void main(String[] args) {
                // creo un nuovo oggetto prodotto

                // 1-nuovo prodotto (costruttore 1)
                Prodotto iphone = new Prodotto("iphone 16 pro max", "apple",
                                BigDecimal.valueOf(999), BigDecimal.valueOf(0.22));

                // 2-nuovo prodotto (costruttore 2)
                Prodotto macbook = new Prodotto("MacBook Air", "apple");

                // 1-iphone
                // metodo per prezzo base
                System.out.println(iphone.getPrezzoBase());

                // cambio valore iva con il setter
                iphone.setIva(BigDecimal.valueOf(0.10));

                // metodo per prezzo comprensivo di iva
                System.out.println(iphone.getPrezzoIvato());

                // metodo per nome esteso concatenando codice e nome
                System.out.println(iphone.getNomeEsteso());

                // 2-macbook
                System.out.println(macbook.getNome());

                // cambio valore marca con il setter
                macbook.setMarca("Samsung");
                System.out.println(macbook.getMarca());

                // SMARTPHONE
                Smartphone galaxySmartphone = new Smartphone("Galaxy S25", "Samsung", BigDecimal.valueOf(850),
                                BigDecimal.valueOf(0.22), 128);

                // i primi 3 println sono stati ereditati da Prodotto.java,
                // non ci sono in Smartphone.java
                System.out.println(galaxySmartphone.getNome());
                System.out.println(galaxySmartphone.getCodice());
                System.out.println(galaxySmartphone.getNomeEstesoPlusImei());
                System.out.println(galaxySmartphone.getCodiceImei());
                System.out.println(galaxySmartphone.getMemoria());

                // TELEVISORI
                Televisori sonySmart = new Televisori("Sony Bravia", "Sony", BigDecimal.valueOf(1000),
                                BigDecimal.valueOf(0.22), "60 pollici", true);

                System.out.println(sonySmart.getCodice());
                System.out.println(sonySmart.getNomeEsteso());
                System.out.println(sonySmart.getDimensione());

                // CUFFIE
                Cuffie beatsSolo = new Cuffie("Beats Solo", "Beats", BigDecimal.valueOf(150),
                                BigDecimal.valueOf(0.22), "rosso", true);

                System.out.println(beatsSolo.getPrezzoBase());
                System.out.println(beatsSolo.getColore());
                System.out.println(beatsSolo.getWireless());
        }
}
