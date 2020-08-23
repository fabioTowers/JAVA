package exercicio1;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaTeste = new Conta();
		
		contaTeste.setConta(873, 87437, 65240, "Beltrano", "11122233344", "Rua sem saida", "belt@email.gov");
		
		System.out.println(contaTeste.getConta());
		
		contaTeste = new Conta();
		
		System.out.println(contaTeste.getConta());
	}

}
