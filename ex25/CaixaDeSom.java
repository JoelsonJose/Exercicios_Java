package ads.coding.lista.ex25;

public class CaixaDeSom {
    private boolean estaLigada;
    private int volume;
    private boolean estaMuda;

    public CaixaDeSom() {
        this.estaLigada = false;
        this.volume = 0;
        this.estaMuda = false;
        System.out.println("Caixa de som pronta para uso.");
    }

    public void ligar() {
        if (!this.estaLigada) {
            this.estaLigada = true;
            System.out.println("Caixa de som ligada.");
        } else {
            System.out.println("A caixa de som já está ligada.");
        }
    }

    public void desligar() {
        if (this.estaLigada) {
            this.estaLigada = false;
            System.out.println("Caixa de som desligada.");
        } else {
            System.out.println("A caixa de som já está desligada.");
        }
    }

    public void ajustarVolume(int novoVolume) {
        if (this.estaLigada) {
            if (novoVolume >= 0 && novoVolume <= 10) {
                this.volume = novoVolume;
                this.estaMuda = (novoVolume == 0);
                System.out.println("Volume ajustado para: " + this.volume);
            } else {
                System.out.println("Volume inválido. Use um valor entre 0 e 10.");
            }
        } else {
            System.out.println("Ligue a caixa de som para ajustar o volume.");
        }
    }

    public void alternarMudo() {
        if (this.estaLigada) {
            this.estaMuda = !this.estaMuda;
            if (this.estaMuda) {
                System.out.println("Caixa de som no modo MUDO.");
            } else {
                System.out.println("Modo MUDO desativado.");
            }
        } else {
            System.out.println("Ligue a caixa de som para usar o modo mudo.");
        }
    }

    public void exibirEstado() {
        System.out.println("--- Estado da Caixa de Som ---");
        System.out.println("Status: " + (this.estaLigada ? "Ligada" : "Desligada"));
        System.out.println("Volume: " + this.volume);
        System.out.println("Modo Mudo: " + (this.estaMuda ? "Ativo" : "Inativo"));
        System.out.println("------------------------------");
    }
}
