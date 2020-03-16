package exercicios_2;
import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um ano:");
		ano = in.nextInt();
		
		if(ano < 0 || ano > 9999) {
			System.out.println("O valor digitado est� fora do intervalo permitido (0 a 9999)!");
		}
		
		if( ((ano%4)==0) && ((ano%100)!=0) ) {
			System.out.println("Esseano � bissexto!");
		}
		else {
			System.out.println("Esse ano n�o � bissexto!");
		}
		
		in.close();
	}

}
