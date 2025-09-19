package ads.coding.lista.ex24;

public class App {

	public static void main(String[] args) {
		Cofre meuCofre = new Cofre("1234");
        
        System.out.println("\n--- Tentativa 1: Senha errada ---");
        meuCofre.abrir("4321");
        meuCofre.exibirEstado();
        
        System.out.println("\n--- Tentativa 2: Senha correta ---");
        meuCofre.abrir("1234");
        meuCofre.exibirEstado();

        System.out.println("\n--- Tentativa 3: Alterar senha ---");
        meuCofre.alterarSenha("5678");
        meuCofre.fechar();
        meuCofre.exibirEstado();

        System.out.println("\n--- Tentativa 4: Abrir com a nova senha ---");
        meuCofre.abrir("5678");
        meuCofre.exibirEstado();

	}

}
