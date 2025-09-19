package ads.coding.lista.ex27;

public class App {
    public static void main(String[] args) {
        Termostato sala = new Termostato(20.0);
        Termostato quarto = new Termostato(28.0); 

        System.out.println("\n=== Sala ===");
        sala.status();
        sala.definirTemperaturaDesejada(25.0);
        sala.simular();

        System.out.println("\n=== Quarto ===");
        quarto.status();
        quarto.definirTemperaturaDesejada(22.0);
        quarto.simular();
    }
}
