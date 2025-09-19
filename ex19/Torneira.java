package ads.coding.lista.ex19;

public class Torneira {
    private boolean aberta;
    private int intensidade; // 0 = fechada, 1 a 5 = intensidade do fluxo

    public Torneira() {
        this.aberta = false;
        this.intensidade = 0;
    }

    public void abrir() {
        if (aberta) {
            System.out.println("A torneira já está aberta. Intensidade: " + intensidade);
        } else {
            aberta = true;
            intensidade = 1; // abre no mínimo
            System.out.println("Torneira aberta no nível " + intensidade + ".");
        }
    }

    public void fechar() {
        if (!aberta) {
            System.out.println("A torneira já está fechada.");
        } else {
            aberta = false;
            intensidade = 0;
            System.out.println("Torneira fechada.");
        }
    }

    public void regularFluxo(int nivel) {
        if (!aberta) {
            System.out.println("Não é possível regular. A torneira está fechada.");
        } else if (nivel < 1 || nivel > 5) {
            System.out.println("Nível inválido! Escolha de 1 a 5.");
        } else {
            intensidade = nivel;
            System.out.println("Fluxo ajustado para intensidade " + intensidade + ".");
        }
    }

    public void status() {
        if (aberta) {
            System.out.println("Torneira aberta. Intensidade do fluxo: " + intensidade);
        } else {
            System.out.println("Torneira fechada.");
        }
    }
}
