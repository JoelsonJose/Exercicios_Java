package ads.coding.lista.ex26;

public class CaixaRegistradora {
    private double totalVendas;
    private boolean fechado;

    public CaixaRegistradora() {
        this.totalVendas = 0.0;
        this.fechado = false;
    }

    public void registrarVenda(double valor) {
        if (fechado) {
            System.out.println("Não é possível registrar venda. O caixa já foi fechado.");
        } else if (valor > 0) {
            totalVendas += valor;
            System.out.println("Venda registrada: R$ " + valor);
        } else {
            System.out.println("Valor inválido para venda.");
        }
    }

    public void fecharCaixa() {
        if (!fechado) {
            fechado = true;
            System.out.println("Caixa fechado. Total de vendas: R$ " + totalVendas);
        } else {
            System.out.println("Este caixa já está fechado.");
        }
    }

    public void status() {
        System.out.println("Status: " + (fechado ? "Fechado" : "Aberto") 
            + " | Total atual: R$ " + totalVendas);
    }
}
