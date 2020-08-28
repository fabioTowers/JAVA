
package exercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda v1 = new Venda();
		v1.adicionaVenda(600); //vendas no mês 3
		v1.adicionaVenda(500); //vendas no mês 4
		v1.adicionaVenda(400); //vendas no mês 5
		v1.adicionaVenda(300); //vendas no mês 6
		v1.adicionaVenda(200); //vendas no mês 7
		v1.adicionaVenda(100); //vendas no mês 8
		
		Venda v2 = new Venda();
		
		System.out.println("O total acumulado em vendas nos seis meses anteriores foi de R$ " + v2.getTotalVendas());
	}

}
/*
 * 
 *private static double totalVendas = 0;
 * Com o atributo totalVendas (da classe Venda) declarado como estático o resultado foi de 2100.
 * 
 *private double totalVendas = 0;
 * Com o atributo totalVendas (da classe Venda) declarado como dinâmico o resultado foi de 0.
 */
