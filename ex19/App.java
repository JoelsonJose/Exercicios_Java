package ads.coding.lista.ex19;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Torneira torneira1 = new Torneira();
        Torneira torneira2 = new Torneira();

        int opcaoPrincipal;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Controlar Torneira 1");
            System.out.println("2 - Controlar Torneira 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcaoPrincipal = sc.nextInt();

            Torneira torneiraAtiva = null;
            if (opcaoPrincipal == 1) torneiraAtiva = torneira1;
            else if (opcaoPrincipal == 2) torneiraAtiva = torneira2;

            if (torneiraAtiva != null) {
                int acao;
                do {
                    System.out.println("\n--- Controle da Torneira ---");
                    System.out.println("1 - Abrir");
                    System.out.println("2 - Fechar");
                    System.out.println("3 - Regular fluxo");
                    System.out.println("4 - Ver status");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha: ");
                    acao = sc.nextInt();

                    switch (acao) {
                        case 1 -> torneiraAtiva.abrir();
                        case 2 -> torneiraAtiva.fechar();
                        case 3 -> {
                            System.out.print("Informe intensidade (1 a 5): ");
                            int nivel = sc.nextInt();
                            torneiraAtiva.regularFluxo(nivel);
                        }
                        case 4 -> torneiraAtiva.status();
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
