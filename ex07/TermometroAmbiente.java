package ads.coding.lista.ex07;

public class TermometroAmbiente {
	 String temperatura = "Temperatura atual é de 24ºC";
	 CLIMA termometro = CLIMA.TEMPERATURA_AMBIENTE;
	 CIDADES local = CIDADES.RECIFE;
	 
	 
	 public void EscolhendoCidadeRecife() {
		 local = CIDADES.RECIFE;
		 termometro = CLIMA.TEMPERATURA_AMBIENTE;
		 System.out.println("Avaliando a temperatura de Recife.");
		 temperatura = "Temperatura atual é de 23ºC";
	 }
	 
	 public void EscolhendoCidadeSaoPaulo() {
		 local = CIDADES.SAO_PAULO;
		 termometro = CLIMA.QUENTE;
		 System.out.println("Avaliando a temperatura de São Paulo.");
		 temperatura = "Temperatura atual é de 45ºC";
		 
	 }
	public void EscolhendoCidadeParana() {
		local = CIDADES.PARANA;
		termometro = CLIMA.FRIO;
		System.out.println("Avaliando a temperatura do Paraná.");
		temperatura = "Temperatura atual é de -1ºC";
	}
	
	public void medir() {
		System.out.println(temperatura);
	}
	
	public void DiminuindoTemperatura() {
		termometro = CLIMA.FRIO;
		temperatura = "Temperatura atual é de 10ºC";
		System.out.println("Atualização de medição: " + temperatura + " em " + local);
	}
	
	public void AumentandoTemperatura() {
		termometro = CLIMA.QUENTE;
		temperatura = "Temperatura atual é de 36ºC";
		System.out.println("Atualização de medição: " + temperatura + " em " + local);
	}
	
	 
	 public enum CLIMA {
		 FRIO,
		 TEMPERATURA_AMBIENTE,
		 QUENTE
	 }
	 
	 public enum CIDADES {
		 RECIFE,
		 SAO_PAULO,
		 PARANA
	 }
}