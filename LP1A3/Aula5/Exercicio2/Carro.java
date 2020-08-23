package exercicio2;

public class Carro {
	private String fabricante;
	private String modelo;
	private String placa;
	
	public void setCarro(String fabricante, String modelo, String placa) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String getCarro() {
		return("\n Fabricante: " + fabricante + 
			   "\n Modelo: " + modelo +
			   "\n Placa: " + placa);
	}

}
