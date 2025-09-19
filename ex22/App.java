package ads.coding.lista.ex22;

public class App {

	public static void main(String[] args) {
	    //Forno 1: para assar um bolo
        System.out.println("--- Forno 1: Assando um bolo ---");
        FornoEletrico fornoBolo = new FornoEletrico();
        fornoBolo.exibirEstado();
        fornoBolo.ligar(180);
        fornoBolo.simularAquecimento();
        fornoBolo.exibirEstado();
        fornoBolo.desligar();

        System.out.println("\n----------------------------------------\n");

        //Forno 2: para gratinar
        System.out.println("--- Forno 2: Gratinando algo ---");
        FornoEletrico fornoGratinar = new FornoEletrico();
        fornoGratinar.exibirEstado();
        fornoGratinar.ligar(250);
        fornoGratinar.simularAquecimento();
        fornoGratinar.exibirEstado();
        fornoGratinar.desligar();
	}

}
