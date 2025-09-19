package ads.coding.lista.ex06;

public class App {
	public static void main(String[] args){
		ContaBancariaSimples ContaCorrente = new ContaBancariaSimples ();
		ContaCorrente.Depositar(1000);
		ContaCorrente.Sacar(500);
		ContaCorrente.Sacar(500);
		ContaCorrente.Sacar(250);
	}
}
