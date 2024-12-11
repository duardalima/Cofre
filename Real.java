package Empresa;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public double converterParaReal() {
        return valor; // Já está em Real, portanto não é necessário conversão
    }
}
