package exercicios_2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String produtos[] = new String[10];
		
		int primeiroValor, segundoValor;
		
		Scanner in = new Scanner(System.in);
		
		for(int aux=0; aux<=9; aux++) {
			System.out.print("Digite o nome do produto " + (aux+1) + " : ");
			produtos[aux] = in.next();
			in.nextLine();
			
		}
		
		System.out.print("\nDigite o 1� valor da faixa:" );
		primeiroValor = in.nextInt();
		in.nextLine();
		System.out.print("\nDigite o 2� valor da faixa:" );
		segundoValor = in.nextInt();
		in.nextLine();
		
		
		if(primeiroValor != segundoValor && primeiroValor > 1 && primeiroValor <= 10 && segundoValor > 1 && segundoValor <= 10) {
				
			for(int aux=primeiroValor; aux<=segundoValor; aux++) {
					System.out.println(produtos[aux]);
			}
		}
		else {
			System.out.println("Valor Inv�lido!!");
		}
		
		in.close();
	}

}
