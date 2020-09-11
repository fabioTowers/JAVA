package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opcao = 9; //Iniciada em um valor fora do intervalo de opções do menu
		String livro; //Recebe o nome do livro informado pelo usuário
		Pilha pilhaDeLivros = new Pilha();
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. INSERIR LIVRO");
			System.out.println("\t2. REMOVER LIVRO");
			System.out.println("\t3. IMPRIMIR PILHA");
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
			case 1:// INSERIR LIVRO
				System.out.println("\n************INSERIR LIVRO*************");
				System.out.print("Informe o nome do livro: ");
				livro = in.nextLine();
				pilhaDeLivros.inserirLivro(livro);
				System.out.println("Livro inserido na pilha com sucesso!");
				System.out.print("**************************************\n");
				break;
			case 2:// REMOVER LIVRO
				System.out.println("\n*************REMOVER LIVRO************");
				pilhaDeLivros.removerLivro();
				System.out.println("Livro removido da pilha com sucesso!");
				System.out.print("**************************************\n");
				break;
			case 3:// IMPRIMIR PILHA
				System.out.print("************IMPRIMIR PILHA************\n");
				System.out.println( pilhaDeLivros.retornaLivros() );
				System.out.print("\n**************************************\n");
				break;
			case 0:// SAIR
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
