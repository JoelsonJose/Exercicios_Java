package ads.coding.lista.ex10;

public class ElevadorPredial {
    int andarAtual;
    int andarMinimo;
    int andarMaximo;

    ElevadorPredial(int minimo, int maximo, int inicial) {
        andarMinimo = minimo;
        andarMaximo = maximo;
        andarAtual  = inicial;
    }

    void ir(int destino) {
        if (destino >= andarMinimo && destino <= andarMaximo) {
            andarAtual = destino;
            System.out.println("Foi para o andar " + andarAtual);
        } else {
            System.out.println("Andar inválido!");
        }
    }

    void mostrarAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}