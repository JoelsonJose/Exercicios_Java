package ads.coding.lista.ex02;

public class PortaComTranca {
	boolean aberta;
	boolean trancada;
	
	public  PortaComTranca() {
		 this.aberta = false;
	     this.trancada = false;
	}
	
	public void abrir() {
		if(aberta){
			System.out.println("A porta já está aberta!");
		} else if (trancada){
			System.out.println("A porta está trancada! Destranque antes.");
		} else {
			aberta = true;
			System.out.println("A porta foi aberta.");
		}
	}
	
	public void fechar() {
		if (!aberta) {
			System.out.println("A porta já está fechada!");
		} else {
			aberta = false;
			System.out.println("A porta foi fechada.");
		}
	}
	
	public void trancar() {
		if (aberta) {
			System.out.println("Não é possível trancar uma porta aberta. Feche primeiro.");
		} else if (!aberta) {
			trancada = true;
			System.out.println("A porta foi trancada.");
		} else {
			System.out.println("A porta já está trancada!");
		}
	}
	
	public void destrancar() {
		if (!trancada) {
			System.out.println("A porta já está destrancada!");
		} else {
			trancada = false;
			System.out.println("A porta foi destrancada.");
		}
	}
	public void status() {
        String estado = "Porta " + (aberta ? "aberta" : "fechada") 
                        + " e " + (trancada ? "trancada" : "destrancada");
        System.out.println(estado);
    }
}
