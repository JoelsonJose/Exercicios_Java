package ads.coding.lista.ex17;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Bicicleta bike1 = new Bicicleta();
	        Bicicleta bike2 = new Bicicleta();

	        int opcaoPrincipal;
	        do {
	            System.out.println("\n=== MENU DAS BICICLETAS ===");
	            System.out.println("1 - Bicicleta 1");
	            System.out.println("2 - Bicicleta 2");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha: ");
	            opcaoPrincipal = sc.nextInt();

	            Bicicleta bikeSelecionada = null;
	            if (opcaoPrincipal == 1) bikeSelecionada = bike1;
	            else if (opcaoPrincipal == 2) bikeSelecionada = bike2;

	            if (bikeSelecionada != null) {
	                int acao;
	                do {
	                    System.out.println("\n--- Controle da Bicicleta ---");
	                    System.out.println("1 - Aumentar marcha");
	                    System.out.println("2 - Diminuir marcha");
	                    System.out.println("3 - Pedalar");
	                    System.out.println("4 - Ver status");
	                    System.out.println("0 - Voltar");
	                    System.out.print("Escolha: ");
	                    acao = sc.nextInt();

	                    switch (acao) {
	                        case 1 -> bikeSelecionada.aumentarMarcha();
	                        case 2 -> bikeSelecionada.diminuirMarcha();
	                        case 3 -> {
	                            System.out.print("Digite a distância (km): ");
	                            int km = sc.nextInt();
	                            bikeSelecionada.pedalar(km);
	                        }
	                        case 4 -> bikeSelecionada.status();
	                        case 0 -> System.out.println("Voltando ao menu principal...");
	                        default -> System.out.println("Opção inválida.");
	                    }
	                } while (acao != 0);
	            }

	        } while (opcaoPrincipal != 0);

	        sc.close();
	        System.out.println("Programa encerrado.");
	    }
}
