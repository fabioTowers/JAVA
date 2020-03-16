package exercicios_2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float faturamento[] = new float[12];
		float total=0;
		
		Scanner in = new Scanner(System.in);
		
		for(float mes : faturamento) {
			System.out.print("Digite o faturamento do m�s: ");
			mes = in.nextFloat();
			in.nextLine();
			total = total + mes;
		}
		
		System.out.print("Faturamento deste ano R$ "+total + "\n");
		
		if(total>=50000) {
		System.out.println("O faturamento anual foi baixo (menor ou igual a R$50.000,00)!");
		}
		else if(total>=50000.01 && total<=100000) {
			System.out.println("O faturamento anual foi medio (entre R$ 50.000,01 e R$ 100.000,00)!");
		}
		else {
			System.out.println("O faturamento anual foi alto (maior que R$ 100.000,00)!");
		}
	in.close();
	}

}
