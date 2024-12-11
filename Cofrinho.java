package Empresa; 

import java.util.ArrayList;

public class Cofrinho {
    ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public boolean removerMoeda(Moeda moeda) {
        return moedas.remove(moeda);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");
            return;
        }
        for (Moeda moeda : moedas) {
            System.out.println("Moeda: " + moeda.getPais() + ", Valor: " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}