package ads.coding.lista.ex05;

public class TelevisaoSimples {
	boolean ligar = false;
	VOLUME modo = VOLUME.MUTADO;
	CANAIS alterar = CANAIS.GLOBO;
	

	public void ligar() {
		ligar = true;
		System.out.println("TV ligada.");
	}
	
	public void desligar() {
		ligar = false;
		System.out.println("TV desligada.");
	}
	
	public void MutarVolume() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o volume.");
		} else {
		modo = VOLUME.MUTADO;
		System.out.println("O volume da TV está mutado.");
		}
	}
	
	public void VolumeMinimo() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o volume.");
		} else {
		modo = VOLUME.MINIMO;
		System.out.println("A TV está no volume minimo.");
		}
	}
	
	public void VolumeMedio() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o volume.");
		} else {
		modo = VOLUME.MEDIO;
		System.out.println("A TV está no volume médio.");
		}
	}
	
	public void VolumeMaximo() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o volume.");
		} else {
		modo = VOLUME.MAXIMO;
		System.out.println("A TV está no volume máximo.");
		}
	}
	
	public void TrocarParaSBT() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o canal.");
		} else {
		alterar = CANAIS.SBT;
		System.out.println("Transmitindo SBT.");
		}
	}
	
	public void TrocarParaGlobo() {
		if (ligar == false) {
			System.out.println("Ligue a TV antes de alterar o canal.");
		} else {
		alterar = CANAIS.GLOBO;
		System.out.println("Transmitindo Globo.");
		}
	}
	
	public enum VOLUME {
		MUTADO,
		MINIMO,
		MEDIO,
		MAXIMO
	}
	
	public enum CANAIS {
		GLOBO,
		SBT
	}
}