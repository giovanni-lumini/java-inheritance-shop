package org.lessons.java.shop;

//decimali per valute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;
/* import java.math.RoundingMode; */

public class ContoBancario {
    // istanze
    public int numeroConto;
    public BigDecimal saldo;

    // costruttore
    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        // inizializzo il saldo a 0
        this.saldo = BigDecimal.ZERO;
    }

    // metodi
    // deposito
    public void deposito(BigDecimal deposito) {
        if (deposito.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(deposito);
            System.out.println("Deposito effettuato");
        } else {
            System.out.println("L'importo depositabile deve essere maggiore di 0");
        }
    }

    // prelievo
    public void prelievo(BigDecimal prelievo) {
        if (this.saldo.subtract(prelievo).compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = saldo.subtract(prelievo);
            System.out.println("Prelievo effettuato");
        } else {
            System.out.println("L'importo prelevabile deve essere inferiore del saldo");
        }
    }

    // saldo corrente
    public String saldoCorrente() {
        return "Il tuo saldo corrente è: " + saldo;
    }
}
