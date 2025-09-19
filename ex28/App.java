package ads.coding.lista.ex28;

public class App {
    public static void main(String[] args) {
        SensorDePresenca sensor1 = new SensorDePresenca();
        SensorDePresenca sensor2 = new SensorDePresenca();

        System.out.println("\n=== Sensor 1 ===");
        sensor1.status();
        sensor1.detectar(); // ainda inativo
        sensor1.ativar();
        sensor1.detectar(); // agora responde

        System.out.println("\n=== Sensor 2 ===");
        sensor2.ativar();
        sensor2.detectar();
        sensor2.desativar();
        sensor2.detectar(); // não reage porque foi desligado
    }
}
