package ads.coding.lista.ex18;

public class AlarmeResidencial {
    private boolean estaArmado;

    public AlarmeResidencial() {
        this.estaArmado = false;
        System.out.println("O alarme de segurança está instalado e desarmado.");
    }

    public void armar() {
        this.estaArmado = true;
        System.out.println("Alarme ARMADO. O sistema está ativado.");
    }

    public void desarmar() {
        this.estaArmado = false;
        System.out.println("Alarme DESARMADO. O sistema está inativo.");
    }

    public void simularEvento() {
        System.out.println("Movimento detectado!");
        if (this.estaArmado) {
            System.out.println("Alarme disparado!");
        } else {
            System.out.println("Nenhum alarme disparou, pois o sistema está desarmado.");
        }
    }
}