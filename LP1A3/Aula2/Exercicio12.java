package exercicios_2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] dados = new String[10][2];
		String alturaMinima;
		
		Scanner in = new Scanner(System.in);
		
		for(int aux = 0; aux <=1; aux++) {
			System.out.print("\nDigite o nome da "+ (aux+1) +"� pessoa:\n");
			dados[aux][0] = in.next();
			in.nextLine();
			System.out.print("Digite o a altura: ");
			dados[aux][1] = in.next();
			in.nextLine();
			System.out.println("\n\n");
		}
		
		System.out.print("\nDigite a valor da altura m�nima: ");
		alturaMinima = in.next();
		in.nextLine();
		
		int aux=0;
		while( aux<=1) {
			if( Float.parseFloat(dados[aux][1]) >= Float.parseFloat(alturaMinima) ) {
				System.out.println(dados[aux][0]+"\n\t"+dados[aux][1]);
				aux++;
				continue;
			}
			aux++;
		}//while
		in.close();
	}// m�todo void

}//classe
