package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Integer opcao = 4; //Iniciada em um valor fora do intervalo de opções do menu
		double auxDouble1 = 0;//armazena o valor informado pelo usuário para calcular a raiz quadrada
							 //armazena também o valor informado pelo usuário (base) para calcular a potenciação
		double auxDouble2 = 0;//aramazena o valor informado pelo usuário para calcular a potenciação (expoente)
		Integer auxInt = 0;
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. CALCULAR RAIZ QUADRADA");
			System.out.println("\t2. CALCULAR POTENCIAÇÃO");
			System.out.println("\t3. CALCULAR FATORIAL");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			case 1://CALCULAR RAIZ QUADRADA
				System.out.println("\n*************Raiz Quadrada************");
				System.out.print("Digite o número que deseja calcular: ");
				auxDouble1 = in.nextDouble();
				in.nextLine();
				System.out.println("\nA raiz quadrada de " + auxDouble1 + " é igual a " + Calculo.ExecutarCalculo(auxDouble1));
				System.out.print("****************************[Press. ENTER]");
				in.nextLine();
			break;
			case 2://CALCULAR POTENCIAÇÃO
				System.out.println("\n**************Potenciação*************");
				System.out.print("Base: ");
				auxDouble1 = in.nextDouble();
				in.nextLine();
				System.out.print("Expoente: ");
				auxDouble2 = in.nextDouble();
				in.nextLine();
				System.out.println("\n" + auxDouble1 + " elevado a " + auxDouble2 + " é igual a " + Calculo.ExecutarCalculo(auxDouble1, auxDouble2));
				System.out.print("****************************[Press. ENTER]");
				in.nextLine();
			break;
			case 3://CALCULAR FATORIAL
				System.out.println("\n***************Fatorial***************");
				System.out.print("Digite o número que deseja calcular: ");
				auxInt = in.nextInt();
				in.nextLine();
				System.out.println("\nO fatorial de " + auxInt + " é igual a " + Calculo.ExecutarCalculo(auxInt));
				System.out.print("****************************[Press. ENTER]");
				in.nextLine();
			break;
			case 0:// SAIR
			break;
			default://Nenhuma das opções do menu de opções foi digitada 
				System.out.println("Opção Inválida!");
				System.out.print("****************************[Press. ENTER]");
				in.nextLine();
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
