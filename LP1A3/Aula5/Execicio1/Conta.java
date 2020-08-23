package exercicio1;

public class Conta {
	private Integer idConta;
	private Integer agencia;
	private Integer numeroConta;
	private Cliente titular;
	
	public Conta() {
		titular = new Cliente();
	}
	
	public String getConta() {
		return("\n Identificador: " + idConta + 
			   "\n Agencia: " + agencia +
			   "\n Conta: " + numeroConta +
			   "\n Titular: " + titular.getCliente());
	}
	
	public void setConta(Integer idConta, Integer agencia, Integer numeroConta, String nome, String cpf, String endereco, String email) {
		this.idConta = idConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		titular.setCliente(nome, cpf, endereco, email);
	}
	
}
