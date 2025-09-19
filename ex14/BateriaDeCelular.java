package ads.coding.lista.ex14;

public class BateriaDeCelular {
    int carga;

    BateriaDeCelular(int cargaInicial) {
        if (cargaInicial < 0) {
            carga = 0;
        } else if (cargaInicial > 100) {
            carga = 100;
        } else {
            carga = cargaInicial;
        }
    }

    void consumir(int quantidade) {
        if (quantidade <= 0) return;

        carga -= quantidade;
        if (carga < 0) carga = 0;

        System.out.println("Consumo de " + quantidade + "%. Nível atual: " + carga + "%");
    }


    void carregar(int quantidade) {
        if (quantidade <= 0) return;

        carga += quantidade;
        if (carga > 100) carga = 100;

        System.out.println("Carregou " + quantidade + "%. Nível atual: " + carga + "%");
    }

    void mostrar() {
        System.out.println("Bateria em " + carga + "%");
    }
}