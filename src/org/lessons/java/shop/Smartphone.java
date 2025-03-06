package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    // variabili
    long codiceImei;
    int memoria;

    // costruttore 1
    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int memoria) {
        // super() variabili ereditate
        super(nome, marca, prezzo, iva);

        Random random = new Random();
        this.codiceImei = random.nextLong(999999999999999l);
        this.memoria = memoria;
    }

    // costruttore 2
    public Smartphone(String nome, String marca, BigDecimal prezzo, long codiceImei, int memoria) {
        // super() variabili ereditate
        super(nome, marca, prezzo);

        this.memoria = memoria;
    }

    // metodi
    public long getCodiceImei() {
        return this.codiceImei;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // metodo ereditato da getNomeEsteso (Prodotto.java)
    // in più abbiamo aggiunto l'imei
    public String getNomeEstesoPlusImei() {
        return super.getNomeEsteso() + "-" + codiceImei;
    }

    @Override
    // override del metodo toString(), in Prodotto.java
    public String toString() {
        return super.toString() + "codice IMEI: " + getCodiceImei() + "giga: " + getMemoria();
    }
}
