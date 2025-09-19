package ads.coding.lista.ex08;

public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital(int hora, int minuto) {
        ajustarHorario(hora, minuto);
    }

    public void ajustarHorario(int novaHora, int novoMinuto) {
        if (novaHora >= 0 && novaHora < 24 && novoMinuto >= 0 && novoMinuto < 60) {
            this.hora = novaHora;
            this.minuto = novoMinuto;
            System.out.printf("Horário ajustado para %02d:%02d%n", hora, minuto);
        } else {
            System.out.println("Horário inválido! (hora 0–23, minuto 0–59)");
        }
    }

    public void mostrarHorario() {
        System.out.printf("Hora atual: %02d:%02d%n", hora, minuto);
    }
}