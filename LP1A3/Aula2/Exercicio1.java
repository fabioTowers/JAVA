import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = in.nextInt();
		in.nextLine();
		
		if( (numero%2) == 0 ) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � impar");
		}
		
		in.close();
	}

}
