package ads.coding.lista.ex07;

public class App {

	public static void main(String[] args) {
	TermometroAmbiente T1 = new TermometroAmbiente();
	TermometroAmbiente T2 = new TermometroAmbiente();
		
	T1.EscolhendoCidadeRecife();
	T1.medir();
	T1.DiminuindoTemperatura();
	
	T2.EscolhendoCidadeParana();
	T2.medir();
	T2.AumentandoTemperatura();
	
	}

}