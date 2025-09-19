package ads.coding.lista.ex30;

public class Computador {
    private boolean ligado;
    private String appAtivo;

    public Computador() {
        this.ligado = false;
        this.appAtivo = null;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O computador já está ligado.");
        } else {
            ligado = true;
            System.out.println("Computador ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O computador já está desligado.");
        } else {
            ligado = false;
            appAtivo = null;
            System.out.println("Computador desligado.");
        }
    }

    public void reiniciar() {
        if (!ligado) {
            System.out.println("Não é possível reiniciar. O computador está desligado.");
        } else {
            System.out.println("Reiniciando computador...");
            appAtivo = null;
        }
    }

    public void abrirAplicativo(String app) {
        if (!ligado) {
            System.out.println("Não é possível abrir aplicativos. O computador está desligado.");
        } else {
            appAtivo = app;
            System.out.println("Aplicativo aberto: " + appAtivo);
        }
    }

    public void status() {
        if (ligado) {
            if (appAtivo != null) {
                System.out.println("Computador ligado. Aplicativo ativo: " + appAtivo);
            } else {
                System.out.println("Computador ligado. Nenhum aplicativo aberto.");
            }
        } else {
            System.out.println("Computador desligado.");
        }
    }
}
