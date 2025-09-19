	package ads.coding.lista.ex04;
import java.util.Scanner;

public class VentiladorDeMesa {
	boolean  ligado;
	int velocidade;
	Scanner scanner = new Scanner(System.in);
	String mudanca;
	
	public VentiladorDeMesa() {
		ligado = false;
		velocidade = 0;
	}
	
	public void ligar() {
		if (ligado) {
		System.out.println("O ventilador já está ligado.");
		} else {
		ligado = true;
		velocidade = 1;
		System.out.println("Ventilador ligado. Velocidade atual: " + velocidade + " (baixo)");
		}
	}
	
	public void desligar() {
		if (!ligado) {
			System.out.println("O ventilador já está desligado.");
		} else {
			ligado = false;
			System.out.println("Ventilador desligado.");	
		}
	}
	
	public void mudarVelocidade(int novoNivel)  {
		if (!ligado) {
			System.out.println("Não é possível mudar a velocidade. O ventilador está desligado.");
		} else if (novoNivel < 1 || novoNivel > 3) {
			System.out.println("Nível inválido! Escolha 1 (baixo), 2 (médio) ou 3 (alto).");
		} else {
			System.out.println("Escolha a velocidade: 1 (baixo), 2 (médio), 3 (alto)");
            System.out.print("Velocidade: ");
            novoNivel = scanner.nextInt();
			velocidade = novoNivel;
					switch (velocidade) {
					case 1:
						mudanca = "baixo";
						break;
					case 2: 
						mudanca = "médio";
						break;
					case 3: 
						mudanca = "alto";
						break;
					default:
						mudanca = "inválido";
						break;
					};
					System.out.println("Velocidade alterada para: " + velocidade + " (" + mudanca + ")");
		}
	}
	
	public void status() {
		if (ligado) {
			 String desc;
	            switch (velocidade) {
	                case 1:
	                    desc = "baixo";
	                    break;
	                case 2:
	                    desc = "médio";
	                    break;
	                case 3:
	                    desc = "alto";
	                    break;
	                default:
	                    desc = "desconhecido";
	            }
	            System.out.println("Ventilador ligado. Velocidade: " + velocidade + " (" + desc + ")");
		} else {
			System.out.println("Ventilador desligado.");
		}
	}
}
