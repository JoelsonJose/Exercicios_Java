package ads.coding.lista.ex09;

public class PlayerDeMusica {
	String faixa;
	String status;
	
	public PlayerDeMusica(String faixa) {
		this.status = "parado";
		this.faixa = faixa;
	}
	
	public void tocar() {
		if (status.equals("tocando")) {
			System.out.println("A faixa já está tocando: " + faixa);
		} else {
			status = "tocando";
			System.out.println("Reproduzindo faixa: " + faixa); 
		}
	}
	
	public void pausar() {
		if (status.equals("tocando")) {
			status = "pausado";
			System.out.println("Faixa pausada: " + faixa);
		} else if (status.equals("pausado")) {
			System.out.println("Faixa já está pausada");
		} else {
			System.out.println("Não é possível pausar. O player está parado.");
		}
	}
	
	public void parar() {
		if (!status.equals("parado")) {
			status = "parado";
			System.out.println("Faixa parada: " + faixa);
		} else {
			System.out.println("O player já está parado.");
		}
	}
	
	public void status() {
	        System.out.println("Faixa: " + faixa + " | Status: " + status);
	    }
}
