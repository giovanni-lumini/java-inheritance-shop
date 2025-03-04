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

    }
}
