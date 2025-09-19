package ads.coding.lista.ex01;

import java.util.Scanner;


public class LampadaInteligente {
 private boolean ligada;
 private String modo;
 Scanner scanner =  new Scanner (System.in);

 public LampadaInteligente() {
     this.ligada = false;
     this.modo = "normal"; 
 }

 public void ligar() {
     if (ligada) {
         System.out.println("A lâmpada já está ligada.");
     } else {
         ligada = true;
         System.out.println("A lâmpada foi ligada. Modo atual: " + modo);
     }
 }

 public void desligar() {
     if (!ligada) {
         System.out.println("A lâmpada já está desligada.");
     } else {
         ligada = false;
         System.out.println("A lâmpada foi desligada.");
     }
 }

 public void mudarModo(int opcao) {
     if (!ligada) {
         System.out.println("Não é possível mudar o modo. A lâmpada está desligada.");
     } else {
    	 System.out.println("\n=== MENU DE MODO DA LÂMPADA INTELIGENTE ===");
         System.out.println("1 - leitura");
         System.out.println("2 - relax");
         System.out.print("Escolha: ");
         opcao = scanner.nextInt();
         switch (opcao) {
             case 1: 
            	 modo = "leitura";
            	 System.out.println("Modo alterado para: " + modo);
            	 break;
             case 2: 
            	 modo = "relax";
            	 System.out.println("Modo alterado para: " + modo);
            	 break;
             default: {
                 System.out.println("Modo inválido. Mantendo modo atual.");
                 break;
             }
         }
     }
 }

 public void status() {
     if (ligada) {
         System.out.println("Lâmpada ligada no modo: " + modo);
     } else {
         System.out.println("Lâmpada desligada.");
     }
 }
}
