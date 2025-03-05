package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    // variabili
    String dimensione;
    boolean smart;

    // costruttore
    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String dimensione, boolean smart) {
        // super() variabili ereditate
        super(nome, marca, prezzo, iva);

        this.dimensione = dimensione;
        this.smart = smart;
    }

    // metodi
    public String getDimensione() {
        return this.dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
