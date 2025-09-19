package ads.coding.lista.ex30;

public class App {
    public static void main(String[] args) {
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();

        System.out.println("\n=== Computador 1 ===");
        pc1.status();
        pc1.ligar();
        pc1.abrirAplicativo("Navegador");
        pc1.abrirAplicativo("Editor de Texto");
        pc1.status();
        pc1.reiniciar();
        pc1.status();
        pc1.desligar();

        System.out.println("\n=== Computador 2 ===");
        pc2.ligar();
        pc2.abrirAplicativo("Jogo de Estratégia");
        pc2.status();
        pc2.reiniciar();
        pc2.abrirAplicativo("Planilha");
        pc2.status();
    }
}
