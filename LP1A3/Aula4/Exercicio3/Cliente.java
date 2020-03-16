package exercicio3;

public class Cliente {

	private int codigo;
	private String nome;
	private String cpf;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	
	public boolean setNome(String nome) {
		if(nome.contains(" ") == true) {
			this.nome = nome;
			return true;
		}
		else {
			System.out.println("Nome Inv�lido!");
			return false;
		}
	}
	public String getCpf() {
		return cpf;
	}
	public boolean setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
			return true;
		}
		else {
			System.out.println("CPF Inv�lido!");
			return false;
		}
	}
	
}
