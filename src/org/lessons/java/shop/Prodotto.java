package org.lessons.java.shop;

//random
import java.util.Random;

//decimali per valute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    // ISTANZE
    private int codice;
    private String nome;
    private String marca;
    // BigDecimal va bene per le valute
    private BigDecimal prezzo;
    private BigDecimal iva;

    // METODI
    // costruttore 1
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        // metodo per codice random
        Random random = new Random();
        this.codice = random.nextInt(99999);

        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // costruttore 2
    public Prodotto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    // GETTER E SETTER
    // i metodi get consentono di recuperare una variabile d'istanza
    // i metodi set consentono di modificare una variabile d'istanza
    // codice prodotto (solo in lettura)
    public int getCodice() {
        return this.codice;
    }

    // nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // descrizione
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // prezzo
    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public void setPrezzoBase(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    // iva
    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    // ALTRI METODI
    // metodo per prezzo comprensivo di iva
    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            // per i BigDecimal per le operazioni si usa: add, multiply ecc..
            // setScale permette di definire il numero di cifre decimali e se arrotondare
            // verso l'alto o il basso
            return prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    // metodo per nome esteso concatenando codice e nome
    public String getNomeEsteso() {
        if (nome != null) {
            return codice + "-" + nome;
        }
        return null;
    }
}
