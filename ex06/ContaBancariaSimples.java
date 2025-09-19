package ads.coding.lista.ex06;

public class ContaBancariaSimples {
    private int saldo = 0;

    public void Depositar(int RS) {
        if (RS <= 0) {
            System.out.println("O despósito deve ser um valo positivo.");
        } else {
            saldo += RS;
            System.out.println("Depositou + R$" + RS + ", Saldo atual: " + saldo);
        }
    }

    public void Sacar(int RS) {
        if (RS <= 0) {
            System.out.println("Valor do saque deve ser positivo.");
        } else {
            saldo -= RS;
            if (saldo < 0) {saldo = 0; System.out.println("Tentativa falha de saque.");}
            System.out.println("Sacou R$ -" + RS + ", Saldo atual: " + saldo);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual R$: " + saldo);
    }
}