package ads.coding.lista.ex05;

public class App {

	public static void main(String[] args) {
		TelevisaoSimples T1 = new TelevisaoSimples();
		
		T1.ligar();
		
		
		T1.TrocarParaSBT();
		T1.TrocarParaGlobo();
		
		
		T1.MutarVolume();
		T1.VolumeMinimo();
		T1.VolumeMedio();
		T1.VolumeMaximo();
		
		
		T1.desligar();
		
		
		
		T1.TrocarParaGlobo();
		T1.MutarVolume();
		T1.VolumeMaximo();
	}

}