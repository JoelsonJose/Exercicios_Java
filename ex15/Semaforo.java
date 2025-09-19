package ads.coding.lista.ex15;

public class Semaforo {
 private String corAtual;
 private String nomeCruzamento;

 public Semaforo(String nome) {
     this.nomeCruzamento = nome;
     this.corAtual = "vermelho";
     System.out.println("Semáforo do " + this.nomeCruzamento + " pronto. Estado inicial: " + this.corAtual);
 }

 public void proximaCor() {
     if (this.corAtual.equals("vermelho")) {
         this.corAtual = "verde";
     } else if (this.corAtual.equals("verde")) {
         this.corAtual = "amarelo";
     } else if (this.corAtual.equals("amarelo")) {
         this.corAtual = "vermelho";
     }
 }

 public void exibirEstado() {
     System.out.println("Semáforo " + this.nomeCruzamento + " está na cor: " + this.corAtual);
 }
}