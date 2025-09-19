package ads.coding.lista.ex25;

public class App {

	public static void main(String[] args) {
		CaixaDeSom minhaCaixa = new CaixaDeSom();
        minhaCaixa.ligar();

        System.out.println("\n--- Volume em 0 ---");
        minhaCaixa.ajustarVolume(0);
        minhaCaixa.exibirEstado();
        System.out.println("A caixa de som está 'muda', mas tecnicamente o volume é 0.");

        System.out.println("\n--- Aumentar o volume ---");
        minhaCaixa.ajustarVolume(5);
        minhaCaixa.exibirEstado();

        System.out.println("\n--- Ativar o modo MUDO ---");
        minhaCaixa.alternarMudo();
        minhaCaixa.exibirEstado();

        System.out.println("\n--- Desativar o modo MUDO ---");
        minhaCaixa.alternarMudo();
        minhaCaixa.exibirEstado();

	}

}
