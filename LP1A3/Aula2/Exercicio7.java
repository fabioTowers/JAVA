package exercicios_2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String codigos[] = new String[10];
		String nomes[] = new String[10];
		
		float precos[] = new float[10];
		float precoMaximo;
		
		Scanner in = new Scanner(System.in);
		
		for(int aux=0; aux<=9; aux++) {
			System.out.print((aux+1)+".\tDigite o c�digo: ");
			codigos[aux] = in.next();
			in.nextLine();
			
			System.out.print("Digite o nome: ");
			nomes[aux] = in.next();
			in.nextLine();
			
			System.out.print("Digite o pre�o: ");
			precos[aux] = in.nextFloat();
			in.nextLine();
			
			System.out.println("*******************");
		}
		
		System.out.print("\nDigite o pre�o m�ximo: ");
		precoMaximo = in.nextFloat();
		in.nextLine();
		
		for(int aux=0; aux<=9; aux++) {
			if(precos[aux] <= precoMaximo) {
				System.out.println(nomes[aux]+"\t["+codigos[aux]+"]\t"+precos[aux]);
			}
		}
		in.close();
	}

}
