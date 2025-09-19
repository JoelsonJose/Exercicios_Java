package ads.coding.lista.ex09;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        PlayerDeMusica player1 = new PlayerDeMusica("Música Lo-Fi");
	        PlayerDeMusica player2 = new PlayerDeMusica("Rock Clássico");

	        int opcaoPrincipal;
	        do {
	            System.out.println("\n=== MENU PRINCIPAL DAS FAIXAS ===");
	            System.out.println("1 - Player Lo-Fi");
	            System.out.println("2 - Player Rock");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha: ");
	            opcaoPrincipal = sc.nextInt();

	            PlayerDeMusica playerAtivo = null;
	            if (opcaoPrincipal == 1) {
	                playerAtivo = player1;
	            } else if (opcaoPrincipal == 2) {
	                playerAtivo = player2;
	            }

	            if (playerAtivo != null) {
	                int opcao;
	                do {
	                    System.out.println("\n--- Controle do Player ---");
	                    System.out.println("1 - Tocar");
	                    System.out.println("2 - Pausar");
	                    System.out.println("3 - Parar");
	                    System.out.println("4 - Ver status");
	                    System.out.println("0 - Voltar");
	                    System.out.print("Escolha: ");
	                    opcao = sc.nextInt();

	                    switch (opcao) {
	                        case 1 -> playerAtivo.tocar();
	                        case 2 -> playerAtivo.pausar();
	                        case 3 -> playerAtivo.parar();
	                        case 4 -> playerAtivo.status();
	                        case 0 -> System.out.println("Voltando ao menu principal...");
	                        default -> System.out.println("Opção inválida.");
	                    }
	                } while (opcao != 0);
	            }

	        } while (opcaoPrincipal != 0);

	        sc.close();
	        System.out.println("Programa encerrado.");
	}
}
