import java.util.Arrays;
import funcionalidades.CadastrarCliente;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Sair", "Cadastrar Cliente", "Verificar Saldo", "Realizar Saque", "Realizar Deposito", "Verificar Extrato"));
		while(true){
			switch(mainMenu.getSelection()){
				case 1:
					System.out.println("Saiu com sucesso");
					System.exit(0);
					break;
				case 2:
					CadastrarCliente cadastro =  new CadastrarCliente();
					cadastro.cadastrar_cliente();
					break;
        case 5:
				  Deposito novo = new Deposito(50); 
				  break;
				default:
					break;
			}
		}
	}
}
