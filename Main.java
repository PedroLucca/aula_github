import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Sair", "Cadastrar Cliente", "Verificar Saldo", "Realizar Saque", "Realizar Deposito", "Verificar Extrato"));
		//System.out.println(mainMenu.getSelection() + "foi selecionada");
		switch(mainMenu.getSelection()){
			case 1:
				System.out.println("Saiu com sucesso");
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida");

		}
		//System.out.println("Fim");
	}

}
