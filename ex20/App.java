package ads.coding.lista.ex20;

public class App {
    public static void main(String[] args) {
        Liquidificador l1 = new Liquidificador();
        Liquidificador l2 = new Liquidificador();

        System.out.println("\n=== Tentativa com liquidificador desligado ===");
        l1.bater("frutas");

        System.out.println("\n=== Agora ligando o liquidificador e ajustando velocidade ===");
        l1.ligar();
        l1.definirVelocidade(3);
        l1.bater("frutas");

        System.out.println("\n=== Outro liquidificador com ajuste diferente ===");
        l2.ligar();
        l2.definirVelocidade(5);
        l2.bater("sopa");

        System.out.println("\n=== Desligando e tentando novamente ===");
        l2.desligar();
        l2.bater("vitamina");
    }
}
