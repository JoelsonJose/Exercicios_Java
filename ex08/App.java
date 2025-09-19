package ads.coding.lista.ex08;

public class App {

	public static void main(String[] args) {
		
        RelogioDigital relogio1 = new RelogioDigital(8, 30);

       
        RelogioDigital relogio2 = new RelogioDigital(22, 40);

       
        relogio1.mostrarHorario();
        relogio2.mostrarHorario();

       
        relogio1.ajustarHorario(9, 15);
        relogio2.ajustarHorario(23, 59);

    
        relogio1.mostrarHorario();
        relogio2.mostrarHorario();

	}

}
