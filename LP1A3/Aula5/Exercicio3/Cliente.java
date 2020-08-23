package exercicio3;

public class Cliente {
	private Integer codigo;
	private String endereco;
	private String telefone;
	
	protected Integer getCodigo() {
		return codigo;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected String getTelefone() {
		return telefone;
	}
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	protected void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
