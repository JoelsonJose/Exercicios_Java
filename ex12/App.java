package ads.coding.lista.ex12;

public class App {
    public static void main(String[] args) {
        Cronometro c1 = new Cronometro();
        Cronometro c2 = new Cronometro();

       
        c1.iniciar();
        c1.tick();
        c1.tick();
        c1.mostrar();
        c1.parar();

        
        c2.iniciar();
        for (int i = 0; i < 65; i++) {
            c2.tick();
        }
        c2.mostrar();
        c2.parar();

       
        c1.zerar();
        c1.mostrar();
    }
}