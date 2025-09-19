package ads.coding.lista.ex15;

public class App {

	public static void main(String[] args) {
	       Semaforo semaforoRuaPrincipal = new Semaforo("Rua Principal");
	        Semaforo semaforoAvenidaCentral = new Semaforo("Avenida Central");

	        System.out.println("\n--- Ciclo do Semáforo da Rua Principal ---");
	        semaforoRuaPrincipal.exibirEstado();
	        semaforoRuaPrincipal.proximaCor();
	        semaforoRuaPrincipal.exibirEstado();
	        semaforoRuaPrincipal.proximaCor();
	        semaforoRuaPrincipal.exibirEstado();
	        semaforoRuaPrincipal.proximaCor();
	        semaforoRuaPrincipal.exibirEstado();

	        System.out.println("\n--- Ciclo do Semáforo da Avenida Central ---");
	        semaforoAvenidaCentral.exibirEstado();
	        semaforoAvenidaCentral.proximaCor();
	        semaforoAvenidaCentral.exibirEstado();
	        semaforoAvenidaCentral.proximaCor();
	        semaforoAvenidaCentral.exibirEstado();
	        semaforoAvenidaCentral.proximaCor();
	}

}
