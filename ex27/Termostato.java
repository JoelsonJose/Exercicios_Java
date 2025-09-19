package ads.coding.lista.ex27;

public class Termostato {
    private double temperaturaAtual;
    private double temperaturaDesejada;

    public Termostato(double temperaturaInicial) {
        this.temperaturaAtual = temperaturaInicial;
        this.temperaturaDesejada = temperaturaInicial; // começa igual
    }

    public void definirTemperaturaDesejada(double novaTemperatura) {
        temperaturaDesejada = novaTemperatura;
        System.out.println("Temperatura desejada definida para: " + temperaturaDesejada + "°C");
    }

    public void simular() {
        if (temperaturaAtual < temperaturaDesejada) {
            System.out.println("Aquecendo... (" + temperaturaAtual + "°C → " + temperaturaDesejada + "°C)");
        } else if (temperaturaAtual > temperaturaDesejada) {
            System.out.println("Resfriando... (" + temperaturaAtual + "°C → " + temperaturaDesejada + "°C)");
        } else {
            System.out.println("Temperatura estável em " + temperaturaAtual + "°C");
        }
    }

    public void status() {
        System.out.println("Atual: " + temperaturaAtual + "°C | Meta: " + temperaturaDesejada + "°C");
    }
}
