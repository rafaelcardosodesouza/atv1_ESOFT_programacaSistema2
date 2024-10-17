package org.example;

public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculos(){

    }
    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes(){
        //%-10s: alinha a string à esquerda em um campo de 10 caracteres
        System.out.println("+======================================+");
        System.out.printf("%-10s %s%n", "Marca:", marca);
        System.out.printf("%-10s %s%n", "Modelo:", modelo);
        System.out.printf("%-10s %d%n", "Ano:", ano);

    }

}
