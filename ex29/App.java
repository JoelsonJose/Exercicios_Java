package ads.coding.lista.ex29;

public class App {
    public static void main(String[] args) {
        TanqueDeAgua tanque1 = new TanqueDeAgua(100);
        TanqueDeAgua tanque2 = new TanqueDeAgua(50);

        System.out.println("\n=== Tanque 1 ===");
        tanque1.status();
        tanque1.encher(60);
        tanque1.encher(50); 
        tanque1.esvaziar(30);
        tanque1.esvaziar(80); 

        System.out.println("\n=== Tanque 2 ===");
        tanque2.status();
        tanque2.encher(30);
        tanque2.encher(25); 
        tanque2.esvaziar(10);
        tanque2.esvaziar(60); 
    }
}
