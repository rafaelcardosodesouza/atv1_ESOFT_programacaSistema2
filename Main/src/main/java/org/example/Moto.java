package org.example;

public class Moto extends Veiculos {
    private boolean temSindecar;

    public Moto(boolean temSindecar) {
        this.temSindecar = temSindecar;
    }

    public Moto(String marca, String modelo, int ano, boolean temSindecar) {
        super(marca, modelo, ano);
        this.temSindecar = temSindecar;
    }

    public boolean isTemSindecar() {
        return temSindecar;
    }

    public void setTemSindecar(boolean temSindecar) {
        this.temSindecar = temSindecar;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("%-10s %s%n", "Sindecar:", temSindecar ? "sim" : "não");
        super.exibirDetalhes();
    }
}
