package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    // variabili
    long codiceImei;
    int memoria;

    // costruttore
    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int memoria) {
        // super() variabili ereditate
        super(nome, marca, prezzo, iva);

        Random random = new Random();
        this.codiceImei = random.nextLong(999999999999999l);
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
}
