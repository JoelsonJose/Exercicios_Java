package ads.coding.lista.ex21;

public class App {

	public static void main(String[] args) {
        //Pedido 1: Lanche médio com queijo extra
        System.out.println("Pedido 1");
        PedidoDeLanche pedido1 = new PedidoDeLanche("medio", true, false);
        pedido1.exibirDetalhes();

        //Pedido 2: Lanche grande com queijo extra e bacon
        System.out.println("Pedido 2");
        PedidoDeLanche pedido2 = new PedidoDeLanche("grande", true, true);
        pedido2.exibirDetalhes();
	}

}
