package exercicio1;

public class Venda {
	private double totalVendas = 0;
	
	public void adicionaVenda(double novaVenda) {
		totalVendas = totalVendas + novaVenda;
	}

	public double getTotalVendas() {
		return totalVendas;
	}
	
}
