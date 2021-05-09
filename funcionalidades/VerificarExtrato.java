package funcionalidades;

public class VerificarExtrato {
    private String cpf;
    private float valor_final;

    public VerificarExtrato(String cpf) {
		this.cpf = cpf;
        System.out.println("Saque: -50,00\n");
        this.valor_final -= 50;
        System.out.println("Depósito: +50,00\n");
        this.valor_final += 50;
	}

    public float getValor_final() {
		return valor_final;
	}
}
