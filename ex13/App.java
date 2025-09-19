package ads.coding.lista.ex13;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MaquinaDeCafe maquina = new MaquinaDeCafe(200, 500, 500, 200);
		
		int opcao;
		do {
			System.out.println("\n--- MENU MÁQUINA DE CAFÉ ---");
            System.out.println("1 - Preparar Expresso (50ml água, 10g café)");
            System.out.println("2 - Preparar Latte (100ml água, 15g café, 50ml leite)");
            System.out.println("3 - Preparar Capuccino (80ml água, 12g café, 30ml leite)");
            System.out.println("4 - Ver status da máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            
            switch (opcao) {
            case 1,2,3:
            	maquina.prepararBebida(opcao);
            	break;
            case 4:
            	maquina.status();
            	break;
            case 0:
            	System.out.println("Encerrando máquina...");
            	break;
            default:
            	System.out.println("Opção inválida.");
            	break;
            }
            
		} while (opcao != 0 );
		
		input.close();
	}

}
