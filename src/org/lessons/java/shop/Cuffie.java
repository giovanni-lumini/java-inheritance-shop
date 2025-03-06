package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    // variabili
    String colore;
    boolean wireless;

    // costruttore 1
    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        // super() variabili ereditate
        super(nome, marca, prezzo, iva);

        this.colore = colore;
        this.wireless = wireless;
    }

    // costruttore 2
    public Cuffie(String nome, String marca, BigDecimal prezzo, String colore, boolean wireless) {
        // super() variabili ereditate
        super(nome, marca, prezzo);

        this.colore = colore;
        this.wireless = wireless;
    }

    // metodi
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    // override del metodo toString(), in Prodotto.java
    public String toString() {
        return super.toString() + "colore: " + getColore() + "wirelss: " + getWireless();
    }
}
