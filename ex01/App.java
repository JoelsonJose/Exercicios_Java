package ads.coding.lista.ex01;

import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LampadaInteligente lampada1 = new LampadaInteligente();
        LampadaInteligente lampada2 = new LampadaInteligente();

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Controlar Lâmpada 1");
            System.out.println("2 - Controlar Lâmpada 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            LampadaInteligente lampadaSelecionada = null;
            if (opcao == 1) {
            	lampadaSelecionada = lampada1;
            } else if (opcao == 2) {
            	lampadaSelecionada = lampada2;
            }

            if (lampadaSelecionada != null) {
            	int acao;
                do {
                    System.out.println("\n--- Controle da Lâmpada " + opcao + " ---");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    System.out.println("3 - Mudar modo");
                    System.out.println("4 - Ver status");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha: ");
                    acao = scanner.nextInt();

                    switch (acao) {
                        case 1: 
                        	lampadaSelecionada.ligar();
                        	break;
                        case 2: 
                        	lampadaSelecionada.desligar();
                        	break;
                        case 3:
                            lampadaSelecionada.mudarModo(opcao);
                            break;
                        case 4: 
                        	lampadaSelecionada.status();
                        	break;
                        case 0: 
                        	System.out.println("Voltando ao menu principal...");
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