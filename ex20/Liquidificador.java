package ads.coding.lista.ex20;

public class Liquidificador {
    private boolean ligado;
    private int velocidade; // 0 = parado, 1 a 5 = velocidades

    public Liquidificador() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            velocidade = 1; 
            System.out.println("Liquidificador ligado na velocidade " + velocidade);
        } else {
            System.out.println("O liquidificador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("Liquidificador desligado.");
        } else {
            System.out.println("O liquidificador já está desligado.");
        }
    }

    public void definirVelocidade(int v) {
        if (ligado) {
            if (v >= 1 && v <= 5) {
                velocidade = v;
                System.out.println("Velocidade ajustada para " + velocidade);
            } else {
                System.out.println("Velocidade inválida. Escolha entre 1 e 5.");
            }
        } else {
            System.out.println("Não é possível definir velocidade. O liquidificador está desligado.");
        }
    }

    public void bater(String ingrediente) {
        if (ligado) {
            System.out.println("Batendo " + ingrediente + " na velocidade " + velocidade + "...");
        } else {
            System.out.println("Não é possível bater " + ingrediente + ". O liquidificador está desligado.");
        }
    }
}
