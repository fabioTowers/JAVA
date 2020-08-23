package exercicio2;

public class RegistroAluguel {
	private Integer numRegistro;
	private Carro carro;
	private Cliente cliente;
	
	public RegistroAluguel() {
		carro = new Carro();
		cliente = new Cliente();
	}
	
	public String getRegistroAluguel() {
		return("\n Numero de registro: " + numRegistro + 
			   "\n Carro: " + carro.getCarro() +
			   "\n Cliente: " + cliente.getCliente());
	}
	
	public void setRegistroAluguel(Integer numRegistro, String fabricante, String modelo, String placa, String nome, String cpf, String endereco, String email) {
		this.numRegistro = numRegistro;
		carro.setCarro(fabricante, modelo, placa);;
		cliente.setCliente(nome, cpf, endereco, email);
	}

}
