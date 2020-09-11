package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opcao = 9; //Iniciada em um valor fora do intervalo de opções do menu
		String pessoa; //Armazena a string informada pelo usuário
		Fila filaDePessoas = new Fila();
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. INSERIR PESSOA");
			System.out.println("\t2. REMOVER PESSOA");
			System.out.println("\t3. IMPRIMIR FILA");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			try {
				opcao = in.nextInt();
				in.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("A Opção Digitada Inexiste!");
				System.out.print("**************************************\n");
				in.nextLine();
			}
			
			switch(opcao) {
			case 1:// INSERIR PESSOA
				System.out.println("\n***********INSERIR PESSOA*************");
				System.out.print("Digite o nome da pessoa: ");
				pessoa = in.nextLine();
				filaDePessoas.inserirPessoa( pessoa );
				System.out.print("**************************************\n");
				break;
			case 2:// REMOVER PESSOA
				System.out.println("\n************REMOVER PESSOA************");
				filaDePessoas.removePessoa();
				System.out.print("Pessoa removida!\n");
				System.out.print("**************************************\n");
				break;
			case 3:// IMPRIMIR FILA
				System.out.print("*************IMPRIMIR FILA************\n");
				System.out.print( filaDePessoas.retornaPessoas() );
				System.out.print("\n**************************************\n");
				break;
			case 0:// SAIR
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
