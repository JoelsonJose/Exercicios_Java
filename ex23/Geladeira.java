package ads.coding.lista.ex23;

public class Geladeira {
    private double temperaturaAtual;
    private double temperaturaDesejada;
    private boolean portaAberta;

    public Geladeira(double temperaturaInicial, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaInicial;
        this.temperaturaDesejada = temperaturaDesejada;
        this.portaAberta = false;
    }

    public void ajustarTemperatura(double novaTemperatura) {
        System.out.println("Ajustando o termostato para " + novaTemperatura + " °C.");
        this.temperaturaDesejada = novaTemperatura;
    }

    public void abrirPorta() {
        if (!this.portaAberta) {
            System.out.println("Porta da geladeira aberta.");
            this.portaAberta = true;
            System.out.println("A temperatura interna está subindo!");
            this.temperaturaAtual += 2.0;
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    public void fecharPorta() {
        if (this.portaAberta) {
            System.out.println("Porta da geladeira fechada.");
            this.portaAberta = false;
            System.out.println("Iniciando resfriamento para voltar à temperatura desejada.");
            this.temperaturaAtual = this.temperaturaDesejada;
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    public void status() {
        System.out.println("--- Status da Geladeira ---");
        System.out.println("Temperatura Atual: " + this.temperaturaAtual + " °C");
        System.out.println("Temperatura Desejada: " + this.temperaturaDesejada + " °C");
        System.out.println("Porta: " + (this.portaAberta ? "Aberta" : "Fechada"));
        System.out.println("--------------------------");
    }
}