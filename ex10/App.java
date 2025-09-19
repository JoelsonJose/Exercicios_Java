package ads.coding.lista.ex10;

public class App {

	public static void main(String[] args) {
		ElevadorPredial e1 = new ElevadorPredial(0, 5, 0);
        ElevadorPredial e2 = new ElevadorPredial(0, 10, 3);

        e1.mostrarAndar();
        e1.ir(3);
        e1.ir(6);

        e2.mostrarAndar();
        e2.ir(8);
        e2.ir(-1);

	}

}
