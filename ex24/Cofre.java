package ads.coding.lista.ex24;

public class Cofre {
    private boolean estaAberto;
    private String senha;

    public Cofre(String senhaInicial) {
        this.estaAberto = false;
        this.senha = senhaInicial;
        System.out.println("Cofre instalado e fechado. Senha inicial configurada.");
    }

    public void abrir(String senhaDigitada) {
        if (senhaDigitada.equals(this.senha)) {
            this.estaAberto = true;
            System.out.println("Cofre aberto com sucesso!");
        } else {
            System.out.println("Senha incorreta. O cofre não pode ser aberto.");
        }
    }

    public void fechar() {
        if (this.estaAberto) {
            this.estaAberto = false;
            System.out.println("Cofre fechado.");
        } else {
            System.out.println("O cofre já está fechado.");
        }
    }

    public void alterarSenha(String novaSenha) {
        if (this.estaAberto) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Não é possível alterar a senha. O cofre precisa estar aberto.");
        }
    }

    public void exibirEstado() {
        System.out.println("--- Estado do Cofre ---");
        System.out.println("Status: " + (this.estaAberto ? "Aberto" : "Fechado"));
        System.out.println("-----------------------");
    }
}