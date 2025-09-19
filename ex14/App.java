package ads.coding.lista.ex14;

public class App {

	public static void main(String[] args) {
		BateriaDeCelular b1 = new BateriaDeCelular(80);
        BateriaDeCelular b2 = new BateriaDeCelular(30);

   
        b1.mostrar();
        b1.consumir(50);
        b1.consumir(40);
        b1.mostrar();

      
        b1.carregar(60);
        b1.carregar(50);
        b1.mostrar();

      
        b2.mostrar();
        b2.consumir(25);
        b2.carregar(20);
        b2.mostrar();

	}

}
