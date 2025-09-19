package ads.coding.lista.ex13;

public class MaquinaDeCafe {
	int cafe;
	int agua;
	int leite;
	int acucar;
	
	public MaquinaDeCafe(int cafe, int agua, int leite, int acucar) {
		this.cafe = cafe;
		this.agua = agua;
		this.leite = leite;
		this.acucar = acucar;
	}
	
	public void prepararBebida(int opcao ) {
		switch (opcao) {
		case 1:
			prepararExpressoSemAcucar();
			break;
		case 2:
			prepararExpressoComAcucar();
			break;
		case 3:
			prepararCapuccino();
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	public void prepararExpressoSemAcucar() {
		if (agua >= 50 && cafe >= 10) {
			agua -= 50;
			cafe -= 10;
			System.out.println("Expresso sem açúcar pronto!");
		} else {
			System.out.println("Recursos insuficientes para preparar seu Expresso sem açúcar.");
		}
	}
	
	public void prepararExpressoComAcucar() {
		if (agua >= 50 && cafe >= 10 && acucar >= 10 ) {
			agua -= 50;
			cafe -= 10;
			acucar -= 10;
			System.out.println("Expresso com açúcar pronto!");
		} else {
			System.out.println("Recursos insuficientes para preparar seu Expresso com açúcar.");
		}
	}
	
	public void prepararCapuccino() {
		if (agua >= 50 && cafe >= 10 && acucar >= 10 && leite >= 20 ) {
			agua -= 50;
			cafe -= 10;
			acucar -= 10;
			leite -= 20;
			System.out.println("Capuccino pronto!");
		} else {
			System.out.println("Recursos insuficientes para preparar seu Capuccino.");
		}
	}
	
	public void status() {
		 	System.out.println("=== Recursos da máquina ===");
	        System.out.println("Água: " + agua + " ml ");
	        System.out.println("Café: " + cafe + " g ");
	        System.out.println("Leite: " + leite + " ml ");
	        System.out.println("Leite: " + acucar + " g ");
	    }
	
}
