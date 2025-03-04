package org.lessons.java.shop;

public class RegistroStudenti {
    // istanza
    private Studente[] registro;

    // costruttore
    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    // metodi
    // getter
    public Studente[] getRegistro() {
        return this.registro;
    }

    // setter
    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    // aggiungi studente
    public void nuovoStudente(Studente studente) {
        // creo un nuovo registro lungo come quello di prima +1
        Studente[] nuovoRegistro = new Studente[registro.length + 1];
        // copio il vecchio registro nel nuovo
        for (int i = 0; i < registro.length; i++) {
            nuovoRegistro[i] = this.registro[i];
        }
        // aggiungo l'ultimo studente
        nuovoRegistro[registro.length] = studente;

        // sovrascrivo il vecchio registro con il nuovo
        this.registro = nuovoRegistro;
    }

    // override
    public String toString() {
        String outPut = "Registro studenti: ";
        for (Studente studente : this.registro) {
            outPut += String.format("%s; ", studente.datiStudente());
        }
        return outPut;
    }

}
