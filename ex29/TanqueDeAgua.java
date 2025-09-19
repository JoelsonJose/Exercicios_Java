package ads.coding.lista.ex29;

public class TanqueDeAgua {
    private int nivel;
    private int capacidadeMaxima;

    public TanqueDeAgua(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.nivel = 0; 
    }

    public void encher(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para encher.");
        }
        if (nivel + quantidade > capacidadeMaxima) {
            nivel = capacidadeMaxima;
            System.out.println("Tanque cheio! Nível atual: " + nivel + " litros");
        } else {
            nivel += quantidade;
            System.out.println("Enchendo... Nível atual: " + nivel + " litros");
        }
    }

    public void esvaziar(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para esvaziar.");
        }
        if (nivel - quantidade < 0) {
            nivel = 0;
            System.out.println("Tanque esvaziado completamente. Nível atual: 0 litros");
        } else {
            nivel -= quantidade;
            System.out.println("Esvaziando... Nível atual: " + nivel + " litros");
        }
    }

    public void status() {
        System.out.println("Nível do tanque: " + nivel + " / " + capacidadeMaxima + " litros");
    }
}
