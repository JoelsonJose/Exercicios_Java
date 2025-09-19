package ads.coding.lista.ex28;

public class SensorDePresenca {
    private boolean ativo;

    public SensorDePresenca() {
        this.ativo = false; // inicia desligado
    }

    public void ativar() {
        if (ativo) {
            System.out.println("O sensor já está ativo.");
        } else {
            ativo = true;
            System.out.println("Sensor ativado.");
        }
    }

    public void desativar() {
        if (!ativo) {
            System.out.println("O sensor já está inativo.");
        } else {
            ativo = false;
            System.out.println("Sensor desativado.");
        }
    }

    public void detectar() {
        if (ativo) {
            System.out.println("Movimento detectado! Acionando alarme/luz...");
        } else {
            System.out.println("Movimento ignorado (sensor inativo).");
        }
    }

    public void status() {
        String estado = ativo ? "ativo" : "inativo";
        System.out.println("Status do sensor: " + estado);
    }
}
