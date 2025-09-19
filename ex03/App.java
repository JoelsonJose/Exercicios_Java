package ads.coding.lista.ex03;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarroBasico carro1 = new CarroBasico();
        CarroBasico carro2 = new CarroBasico();

        int opcao;
        do {
            System.out.println("\n--- MENU DE CONTROLE ---");
            System.out.println("1 - Controlar Carro 1");
            System.out.println("2 - Controlar Carro 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            CarroBasico carroSelecinado = null;
            if (opcao == 1) {
            	carroSelecinado = carro1;
            } else if (opcao == 2) {
            	carroSelecinado = carro2;
            }

            if (carroSelecinado != null) {
            	int acao;
                do {
                    System.out.println("\n--- Controle do Carro " + opcao + " ---");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    System.out.println("3 - Acelerar");
                    System.out.println("4 - Freiar");
                    System.out.println("5 - Mostrar Velocidade");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha: ");
                    acao = scanner.nextInt();

                    switch (acao) {
                        case 1: 
                        	carroSelecinado.Ligar();
                        	break;
                        case 2: 
                        	carroSelecinado.Desligar();
                        	break;
                        case 3:
                        	System.out.print("Informe quanto deseja acelerar: ");
                        	int acel = scanner.nextInt();
                        	carroSelecinado.acelerar(acel);
                            break;
                        case 4: 
                        	System.out.print("Informe quanto deseja freiar: ");
                        	int fren = scanner.nextInt();
                        	carroSelecinado.freiar(fren);
                        	break;
                        case 5:
                        	carroSelecinado.mostrarVelocidade();
                        	break;
                        case 0: 
                        	System.out.println("Voltando ao menu de controle...");
                        	break;
                        default: 
                        	System.out.println("Opção inválida!");
                        	break;
                    }
                } while (acao != 0);
            }

        } while (opcao != 0);

        System.out.println("Encerrando programa...");
        scanner.close();
    }
}