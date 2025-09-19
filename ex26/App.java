package ads.coding.lista.ex26;

public class App {
    public static void main(String[] args) {
        CaixaRegistradora caixa1 = new CaixaRegistradora();
        CaixaRegistradora caixa2 = new CaixaRegistradora();

        System.out.println("\n=== Caixa 1 ===");
        caixa1.registrarVenda(50.0);
        caixa1.registrarVenda(25.5);
        caixa1.status();
        caixa1.fecharCaixa();

        System.out.println("\n=== Caixa 2 ===");
        caixa2.registrarVenda(100.0);
        caixa2.registrarVenda(10.0);
        caixa2.registrarVenda(40.0);
        caixa2.status();
        caixa2.fecharCaixa();

        System.out.println("\nTentando registrar venda após fechar:");
        caixa1.registrarVenda(30.0);
    }
}
