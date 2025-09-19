package ads.coding.lista.ex21;

public class PedidoDeLanche {
 private String tamanho;
 private boolean temQueijoExtra;
 private boolean temBacon;
 private double precoBase;

 public PedidoDeLanche(String tamanho, boolean queijo, boolean bacon) {
     this.tamanho = tamanho;
     this.temQueijoExtra = queijo;
     this.temBacon = bacon;

     if (tamanho.equalsIgnoreCase("pequeno")) {
         this.precoBase = 10.0;
     } else if (tamanho.equalsIgnoreCase("medio")) {
         this.precoBase = 15.0;
     } else if (tamanho.equalsIgnoreCase("grande")) {
         this.precoBase = 20.0;
     } else {
         this.precoBase = 0.0;
         System.out.println("Tamanho de lanche inválido. Preço base será zero.");
     }
 }

 public double calcularPrecoFinal() {
     double precoFinal = this.precoBase;

     if (this.temQueijoExtra) {
         precoFinal += 2.5;
     }

     if (this.temBacon) {
         precoFinal += 4.0;
     }

     return precoFinal;
 }

 public void exibirDetalhes() {
     System.out.println("Detalhes do Pedido");
     System.out.println("Tamanho: " + this.tamanho);
     System.out.println("Queijo Extra: " + (this.temQueijoExtra ? "Sim" : "Não"));
     System.out.println("Bacon: " + (this.temBacon ? "Sim" : "Não"));
     System.out.println("Preço Final: R$ " + String.format("%.2f", this.calcularPrecoFinal()));
     System.out.println("============");
 }
}
