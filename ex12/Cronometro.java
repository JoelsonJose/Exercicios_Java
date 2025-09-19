package ads.coding.lista.ex12;

public class Cronometro {
    int minuto;
    int segundo;
    boolean ligado;

    Cronometro() {
        minuto = 0;
        segundo = 0;
        ligado = false;
    }

    void iniciar() {
        ligado = true;
        System.out.println("Cronômetro iniciado.");
    }

    void parar() {
        ligado = false;
        System.out.println("Cronômetro parado.");
    }

    void zerar() {
        minuto = 0;
        segundo = 0;
        System.out.println("Cronômetro zerado.");
    }

    void tick() {
        if (ligado) {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
            }
        }
    }

    void mostrar() {
        System.out.printf("Tempo: %02d:%02d%n", minuto, segundo);
    }
}
