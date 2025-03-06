package org.lessons.java.shop.Snack;

public class Studente {
    // istanze
    public String nome;
    public String cognome;
    public int età;

    // costruttore
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    // metodo
    // con il metodo con il return, si possono salvare i dati in una variabile
    // con il void non è possibile
    public String datiStudente() {
        if (nome != null && cognome != null && età > 0) {
            return (nome + " " + cognome + ", " + età + " anni");
        }
        return null;
    }
}
