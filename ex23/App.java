package ads.coding.lista.ex23;

public class App {

	public static void main(String[] args) {

        Geladeira minhaGeladeira = new Geladeira(8.0, 4.0);

        System.out.println("Status Inicial da Geladeira");
        minhaGeladeira.status();

        System.out.println("\nAjustando a temperatura");
        minhaGeladeira.ajustarTemperatura(3.0);
        minhaGeladeira.status();

        System.out.println("\nAbrindo a porta");
        minhaGeladeira.abrirPorta();
        minhaGeladeira.status();

        System.out.println("\nFechando a porta");
        minhaGeladeira.fecharPorta();
        minhaGeladeira.status();
	}

}
