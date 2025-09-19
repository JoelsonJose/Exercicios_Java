package ads.coding.lista.ex16;

public class Impressora {
    private int quantidadePapel;
    private int quantidadeTinta;

    public Impressora(int papelInicial, int tintaInicial) {
        this.quantidadePapel = papelInicial;
        this.quantidadeTinta = tintaInicial;
        System.out.println("A impressora está pronta!");
    }

    public void imprimir(int paginas) {
        if (quantidadePapel >= paginas && quantidadeTinta >= paginas) {
            System.out.println("Imprimindo " + paginas + " página(s)...");
            this.quantidadePapel -= paginas;
            this.quantidadeTinta -= paginas;
        } else {
            System.out.println("Não foi possível imprimir. Falta papel ou tinta.");
        }
    }

    public void adicionarPapel(int papel) {
        this.quantidadePapel += papel;
        System.out.println("Adicionando " + papel + " folha(s) de papel.");
    }

    public void adicionarTinta(int tinta) {
        this.quantidadeTinta += tinta;
        System.out.println("Adicionando " + tinta + " unidade(s) de tinta.");
    }

    public void verificarStatus() {
        System.out.println("Status da Impressora");
        System.out.println("Papel: " + quantidadePapel);
        System.out.println("Tinta: " + quantidadeTinta);
        System.out.println("==========================");
    }
}
