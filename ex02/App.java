package ads.coding.lista.ex02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PortaComTranca porta = new PortaComTranca();
        int opcao;

        do {
            System.out.println("\n--- MENU DA PORTA ---");
            System.out.println("1 - Abrir porta");
            System.out.println("2 - Fechar porta");
            System.out.println("3 - Trancar porta");
            System.out.println("4 - Destrancar porta");
            System.out.println("5 - Ver status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                	porta.abrir(); 
                	break;
                case 2: 
                	porta.fechar(); 
                	break;
                case 3: 
                	porta.trancar(); 
                	break;
                case 4: 
                	porta.destrancar(); 
                	break;
                case 5: 
                	porta.status(); 
                	break;
                case 0: 
                	System.out.println("Encerrando..."); 
                	break;
                default: 
                	System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}