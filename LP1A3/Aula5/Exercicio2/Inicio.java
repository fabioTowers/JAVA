package exercicio2;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistroAluguel registroTeste = new RegistroAluguel();
		
		registroTeste.setRegistroAluguel(327 , "Volkswagen", "Saveiro", "LPA13", "Beltrano", "11122233344", "Rua sem saida", "belt@email.gov");
		
		System.out.println(registroTeste.getRegistroAluguel());
		
		registroTeste = new RegistroAluguel();
		
		System.out.println(registroTeste.getRegistroAluguel());

	}

}
