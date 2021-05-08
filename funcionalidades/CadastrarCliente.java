package funcionalidades;
import java.util.Scanner;
import classes.Cliente;

public class CadastrarCliente {

    public CadastrarCliente() {
		
	}

    public void cadastrar_cliente() {
        System.out.println("Nome do cliente: ");
        Scanner s1 = new Scanner(System.in);
        String nome = s1.nextLine();
        System.out.println("CPF do cliente: ");
        Scanner s2 = new Scanner(System.in);
        String cpf = s2.nextLine();
        Cliente cliente =  new Cliente(nome, cpf);

        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF do cliente: " + cliente.getCpf());

        System.out.println("Usuário Cadastrado!");
    }

}