import java.util.Arrays;
import funcionalidades.CadastrarCliente;
import funcionalidades.Deposito;
import funcionalidades.Saque;
import funcionalidades.VerificarSaldo;
import funcionalidades.VerificarExtrato;

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
					break;
				case 3:
					VerificarSaldo saldo = new VerificarSaldo();
					break;
				case 4:
					Saque novoSaque = new Saque(50);
					break;
				case 5:
					Deposito novoDeposito = new Deposito(50); 
					break;
				case 6:
					VerificarExtrato extrato = new VerificarExtrato("123.000.000-01");
					System.out.println("Valor final: " + extrato.getValor_final() + "\n");
					break;
				default:
					break;
			}
		}
	}
}
