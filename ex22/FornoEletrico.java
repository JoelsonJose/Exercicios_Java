package ads.coding.lista.ex22;

public class FornoEletrico {
    private boolean estaLigado;
    private int temperaturaAtual;
    private int temperaturaAlvo;

    public FornoEletrico() {
        this.estaLigado = false;
        this.temperaturaAtual = 25;
        this.temperaturaAlvo = 0;
        System.out.println("Forno elétrico pronto para uso.");
    }

    public void ligar(int temperaturaDesejada) {
        if (!this.estaLigado) {
            this.estaLigado = true;
            this.temperaturaAlvo = temperaturaDesejada;
            System.out.println("Forno ligado. Temperatura-alvo: " + this.temperaturaAlvo + "°C");
        } else {
            System.out.println("O forno já está ligado.");
        }
    }

    public void desligar() {
        if (this.estaLigado) {
            this.estaLigado = false;
            this.temperaturaAlvo = 0;
            System.out.println("Forno desligado.");
        } else {
            System.out.println("O forno já está desligado.");
        }
    }

    public void simularAquecimento() {
        if (this.estaLigado) {
            System.out.println("Aquecendo...");
            while (this.temperaturaAtual < this.temperaturaAlvo) {
                this.temperaturaAtual += 50;
                if (this.temperaturaAtual > this.temperaturaAlvo) {
                    this.temperaturaAtual = this.temperaturaAlvo;
                }
                System.out.println("Temperatura atual: " + this.temperaturaAtual + "°C");
            }
            System.out.println("Temperatura-alvo atingida!");
        } else {
            System.out.println("Não é possível aquecer, o forno está desligado.");
        }
    }

    public void exibirEstado() {
        System.out.println("--- Estado do Forno ---");
        System.out.println("Status: " + (this.estaLigado ? "Ligado" : "Desligado"));
        System.out.println("Temperatura Atual: " + this.temperaturaAtual + "°C");
        System.out.println("Temperatura Alvo: " + this.temperaturaAlvo + "°C");
        System.out.println("-----------------------");
    }
}