package ads.coding.lista.ex17;

public class Bicicleta {
	int marcha;
	
	public Bicicleta() {
		this.marcha = 1;
	}
	
	public void aumentarMarcha() {
		if (marcha < 5) {
			marcha++;
			System.out.println("Marcha aumentada. Marcha atual: " + marcha);
		} else {
			System.out.println("Já está na marcha máxima (5).");
		}
	}
	
	public void diminuirMarcha() {
		if(marcha > 1) {
			marcha--;
			System.out.println("Marcha aumentada. Marcha atual: " + marcha);
		} else {
			System.out.println("Já está na marcha mínima (1).");
		}
	}
	
	public void pedalar(int distancia) {
		System.out.println("Pedalando " + distancia + " km na marcha " + marcha + ".");
        if (marcha == 1) {
            System.out.println("Marcha leve: ideal para subidas.");
        } else if (marcha == 5) {
            System.out.println("Marcha pesada: ótima para descidas ou velocidade.");
        } else {
            System.out.println("Marcha intermediária.");
        }
	}
	
	public void status() {
		System.out.println("Marcha atual: " + marcha);
	}
}
