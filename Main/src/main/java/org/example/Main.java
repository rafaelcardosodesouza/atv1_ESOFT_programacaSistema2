package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculos> veiculos = new ArrayList<>();
        Scanner SC = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            limpaTela();
            try {
                System.out.println("Bem vindo, deseja cadastrar qual veiculo?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Exibir Veiculos cadastrados");
                System.out.println("0 - Sair");
                int op = Integer.parseInt(SC.nextLine());

                switch (op) {

                    case 1:
                        System.out.println("Certo, você escolheu Carro ");
                        System.out.print("Digite a marca do carro: ");
                        String marcaCarro = SC.nextLine();

                        System.out.print("Agora digite o modelo: ");
                        String modeloCarro = SC.nextLine();

                        System.out.print("Agora digite o ano: ");
                        int anoCarro = SC.nextInt();
                        SC.nextLine();  // Consumir a nova linha após o nextInt()

                        System.out.print("Agora a quantidade de portas: ");
                        int portas = SC.nextInt();
                        SC.nextLine();  // Consumir a nova linha após o nextInt()

                        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, portas);
                        veiculos.add(carro);
                        System.out.print("Veiculo cadastrado com sucesso!\nEnter para continuar ");
                        SC.nextLine();
                        break;


                    case 2:
                        boolean sindecar;
                        System.out.println("Certo, você escolheu Moto: ");
                        System.out.print("Digite a marca da Moto: ");
                        String marca = SC.nextLine();

                        System.out.print("Agora digite o modelo: ");
                        String modelo = SC.nextLine();

                        System.out.print("Agora digite o ano: ");
                        int ano = SC.nextInt();
                        SC.nextLine();  // Consumir a nova linha após o nextInt()

                        System.out.print("Tem sindecar? Caso sim, digite 1, caso não, digite qualquer outro valor: ");
                        String sindecarTeste = SC.nextLine();
                        sindecar = sindecarTeste.equalsIgnoreCase("1");

                        Moto moto = new Moto(marca, modelo, ano, sindecar);
                        veiculos.add(moto);

                        System.out.print("Veiculo cadastrado com sucesso!\nEnter para continuar ");
                        SC.nextLine();
                        break;


                    case 3:
                        for (Veiculos veiculo : veiculos) {
                            veiculo.exibirDetalhes();
                        }

                        System.out.print("Fim da listao!\nEnter para continuar ");
                        SC.nextLine();

                        break;
                    case 0:
                        System.out.println("Saindo....");
                        return;
                    default:
                        System.out.println("Invalido...");
                        continuar = false;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public static void limpaTela() {
        try {
            // Verifica o sistema operacional
            String sistema = System.getProperty("os.name");

            if (sistema.contains("Windows")) {
                // Executa o comando 'cls' no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Executa o comando 'clear' no Linux e MacOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Em caso de erro, exibe a mensagem
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }
}