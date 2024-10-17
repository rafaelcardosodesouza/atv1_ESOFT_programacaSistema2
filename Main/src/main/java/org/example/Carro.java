package org.example;

public class Carro extends Veiculos {

    private int numerosDePorta;

    public Carro(String marca, String modelo, int ano, int numerosDePorta) {
        super(marca, modelo, ano);
        this.numerosDePorta = numerosDePorta;
    }

    public int getNumerosDePorta() {
        return numerosDePorta;
    }

    public void setNumerosDePorta(int numerosDePorta) {
        this.numerosDePorta = numerosDePorta;
    }

    public Carro(int numerosDePorta) {
        this.numerosDePorta = numerosDePorta;
    }


    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("%-10s %s%n", "Nuemros de Porta:", numerosDePorta);

    }
}
