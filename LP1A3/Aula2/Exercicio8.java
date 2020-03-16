package exercicios_2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int qtdNomes;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de nomes que deseja inserir:");
		qtdNomes = in.nextInt();
		
		String nomes[] = new String[qtdNomes];
		
		for(int aux=0; aux<qtdNomes; aux++) {
			System.out.println("Digite o nome ");
			nomes[aux] = in.next();
			in.nextLine();
		}
		
		for(String x : nomes) {
			System.out.println(x);
		}
		
		in.close();
	}

}
