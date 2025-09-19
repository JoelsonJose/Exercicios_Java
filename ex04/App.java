package ads.coding.lista.ex04;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        VentiladorDeMesa ventilador = new VentiladorDeMesa();

        int opcao;
        do {
            System.out.println("\n--- MENU DO VENTILADOR ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Mudar velocidade");
            System.out.println("4 - Ver status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ventilador.ligar();
                    break;
                case 2:
                    ventilador.desligar();
                    break;
                case 3:
                    ventilador.mudarVelocidade(opcao);
                    break;
                case 4:
                    ventilador.status();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
