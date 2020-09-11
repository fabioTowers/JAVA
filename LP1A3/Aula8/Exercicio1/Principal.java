package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opcao = 9; //Iniciada em um valor fora do intervalo de opções do menu
		String produto; //Armazena a string informada pelo usuário
		int posicao; //Armazena inteiro (posicao) digitada pelo usuário
		Lista listaDeProdutos = new Lista();
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. INSERIR PRODUTO");
			System.out.println("\t2. INSERIR PRODUTO EM POSIÇÃO ESPECÍFICA");
			System.out.println("\t3. CONSULTAR PRODUTO (PELO NOME)");
			System.out.println("\t4. CONSULTAR PRODUTO (PELA POSIÇÃO)");
			System.out.println("\t5. SUBSTITUIR PRODUTO");
			System.out.println("\t6. REMOVER PRODUTO (PELO NOME)");
			System.out.println("\t7. REMOVER PRODUTO (PELA POSIÇÃO)");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			try {
				opcao = in.nextInt();
				in.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("A Opção Digitada Inexiste!");
				in.nextLine();
			}
			
			switch(opcao) {
			case 1:// INSERIR PRODUTO
				System.out.println("\n***********INSERIR PRODUTO************");
				System.out.print("Digite o novo produto: ");
				listaDeProdutos.inserirProduto( in.nextLine() );
				in.nextLine();
				System.out.println("Lista atualizada:");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("******************************************");
				break;
			case 2:// INSERIR PRODUTO EM POSIÇÃO ESPECÍFICA
				System.out.println("\nINSERIR PRODUTO EM POSIÇÃO ESPECÍFICA*");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("Digite a posição: ");
				posicao = in.nextInt();
				in.nextLine();
				System.out.print("Digite o produto: ");
				produto = in.nextLine();
				listaDeProdutos.inserirProduto(posicao, produto);
				System.out.println("Lista atualizada:");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("******************************************");
				break;
			case 3:// CONSULTAR PRODUTO (PELO NOME)
				System.out.println("\n*****CONSULTAR PRODUTO (PELO NOME)****");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("\nDigite o nome do produto: ");
				produto = in.nextLine();
				if( listaDeProdutos.consultarNomeProduto(produto) )
					System.out.println("\nO produto "+ produto + " consta na lista!");
				else
					System.out.println("\nO produto "+ produto + " não consta na lista!");
				System.out.print("******************************************");
				break;
			case 4:// CONSULTAR PRODUTO (PELA POSIÇÃO)
				System.out.println("\n***CONSULTAR PRODUTO (PELA POSIÇÃO)***");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("Digite a posição: ");
				posicao = in.nextInt();
				in.nextLine();
				produto = listaDeProdutos.consultarPosicaoProduto(posicao);
				System.out.println("\nO produto na posição " + posicao + " é o(a) " + produto);
				System.out.print("******************************************");
				break;
			case 5:// SUBSTITUIR PRODUTO
				System.out.println("\n**********SUBSTITUIR PRODUTO**********");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("Digite a posição: ");
				posicao = in.nextInt();
				in.nextLine();
				System.out.print("Digite o produto: ");
				produto = in.nextLine();
				listaDeProdutos.substituiProduto(posicao, produto);
				System.out.println("Lista atualizada:");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("******************************************");
				break;
			case 6:// REMOVER PRODUTO (PELO NOME)
				System.out.println("\n*****REMOVER PRODUTO (PELO NOME)******");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("\nDigite o nome do produto: ");
				produto = in.nextLine();
				listaDeProdutos.removeProduto( produto );
				System.out.println("Lista atualizada:");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("******************************************");
				break;
			case 7:// REMOVER PRODUTO (PELA POSIÇÃO)
				System.out.println("\n****REMOVER PRODUTO (PELA POSIÇÃO)****");
				System.out.print("Lista atual: ");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("Digite a posição: ");
				posicao = in.nextInt();
				in.nextLine();
				listaDeProdutos.removeProduto( posicao );
				System.out.println("Lista atualizada:");
				System.out.println( listaDeProdutos.retornaProdutos() );
				System.out.print("******************************************");
				break;
			case 0:// SAIR
			break;
			}//switch
		}//while
		in.close();
	}//Main
}//classe
