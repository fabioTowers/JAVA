package exercicios_2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("************MENU************");
			System.out.println("\n\t1 - Cadastrar Cliente");
			System.out.println("\t2 - Alterar Cliente");
			System.out.println("\t3 - Excluir Cliente");
			System.out.println("\t0 - Sair");
			System.out.println("\n****************************");
			
			opc = in.nextInt();
			in.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Cadastro de Cliente");
				break;
			case 2:
				System.out.println("Altera��o de Cadastro de Cliente");
				break;
			case 3:
				System.out.println("Excluir Cadastro de Cliente");
				break;
			case 0:
				System.out.println("Sair");
				break;
			default:
				System.out.println("Op��o Inv�lida!!!");
				break;
			}
		}
		while(opc != 0);
		
		in.close();
		}
	}


