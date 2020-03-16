package exercicios_2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome[] = new String[10];
		int idade[] = new int[10];
		int idadeMinima;
		
		Scanner in = new Scanner(System.in);
		
		for(int aux=0; aux<=9; aux++) {
			System.out.print("\nDigite o nome da pessoa "+ (aux+1)+" : ");
			nome[aux] = in.next();
			in.nextLine();
			
			System.out.print("\nDigite a idade: ");
			idade[aux] = in.nextInt();
			in.nextLine();
			
			System.out.println("*********************");
		}
		
		System.out.print("Digite a idade m�nima: ");
		idadeMinima = in.nextInt();
		in.nextLine();
		
		System.out.println("\nAs pessoas acima da idade m�nima s�o:");
		
		for(int aux=0; aux<=9; aux++) {
			if(idade[aux] > idadeMinima) {
			System.out.println(nome[aux]+"\t"+idade[aux]);
			}
		}
		
		in.close();
	}

}
