package Empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "EUA");
    }

    @Override
    public double converterParaReal() {
        double taxaDeCambio = 5.00;
        return valor * taxaDeCambio;
    }
}

