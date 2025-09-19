package ads.coding.lista.ex16;

public class App {

	public static void main(String[] args) {
		Impressora minhaImpressora = new Impressora(2, 2);

        //Tentativa 1: Imprimir sem insumo suficiente
        minhaImpressora.imprimir(5);
        minhaImpressora.verificarStatus();

        // Tentativa 2: Adicionar insumo e imprimir
        minhaImpressora.adicionarPapel(10);
        minhaImpressora.adicionarTinta(10);
        minhaImpressora.verificarStatus();

        minhaImpressora.imprimir(5);
        minhaImpressora.verificarStatus();

        // Tentativa 3: Imprimir uma página
        minhaImpressora.imprimir(1);
        minhaImpressora.verificarStatus();

	}

}
