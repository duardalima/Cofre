package Empresa;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "União Europeia");
    }

    @Override
    public double converterParaReal() {
        double taxaDeCambio = 5.50;
        return valor * taxaDeCambio;
    }
}