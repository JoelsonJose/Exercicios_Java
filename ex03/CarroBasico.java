package ads.coding.lista.ex03;

public class CarroBasico {
	boolean ligado;
	int velocidade;
	
	public CarroBasico() {
		ligado = false;
		velocidade = 0;
	}
	
	public void Ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Carro ligado.");
		} else {
			System.out.println("O carro já está ligado!");
		}
	}
	
	public void Desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("Carro desligado.");
		} else if (velocidade > 0) {
			System.out.println("Não é possível desligar o carro em movimento!");
		} else {
			System.out.println("O carro já está desligado!");
		}	
	}
	
	public void acelerar(int aceleracao) {
		if (!ligado) {
			System.out.println("Não é possível acelerar. O carro está desligado.");
		} else {
			velocidade += aceleracao;
			System.out.print("Carro acelerou. Velocidade atual: " + velocidade + "km/h");
		}
	}
	
	public void freiar(int frenagem) {
		if(!ligado) {
			System.out.println("Não é possível freiar. O carro está desligado.");
		} else if (velocidade == 0) {
			System.out.println("O carro já está parado.");
		} else {
			velocidade -= frenagem;
			if (velocidade < 0) velocidade = 0;
			System.out.println("Carro freou. Velocidade atual: " + velocidade + " km/h");
		}
	}
	
	public void mostrarVelocidade() {
		System.out.println(" Velocidade atual: " + velocidade + " km/h");
	}
}
	
