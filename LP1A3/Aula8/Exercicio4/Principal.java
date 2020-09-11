package exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opcao = 9; //Iniciada em um valor fora do intervalo de opções do menu
		Integer qtdProdutos;
		String nomeProduto;
		
		Conjunto primeiroConjunto = new Conjunto();
		Conjunto segundoConjunto = new Conjunto();
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. INSERIR PRODUTOS NO 1° CONJUNTO");
			System.out.println("\t2. INSERIR PRODUTOS NO 2° CONJUNTO");
			System.out.println("\t3. CONSULTAR TODOS PRODUTOS DOS DOIS CONJUNTOS (UNIÃO)");
			System.out.println("\t4. CONSULTAR APENAS PRODUTOS EM COMUM NOS DOIS CONJUNTOS (INTERSECÇÃO)");
			System.out.println("\t5. CONSULTAR PRODUTOS DO 1° CONJUNTO QUE NÃO EXISTEM NO 2° CONJUNTO (DIFERENÇA)");
			System.out.println("\t6. CONSULTAR SE O 1° CONJUNTO ESTÁ CONTIDO NO 2° CONJUNTO (VERIFICAÇÃO DE SUBCONJUNTO)");
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
			case 1:// INSERIR PRODUTOS NO 1° CONJUNTO
				System.out.println("\n***INSERIR PRODUTOS NO 1° CONJUNTO****");
				System.out.print("Digite quantos produtos deseja inserir: ");
				qtdProdutos = in.nextInt();
				in.nextLine();
				for(int aux = 0; aux < qtdProdutos; aux++) {
					System.out.print("\nDigite o nome do produto: ");
					nomeProduto = in.nextLine();
					primeiroConjunto.inserirProduto( nomeProduto );
				}
				System.out.print("**************************************\n");
				break;
			case 2:// INSERIR PRODUTOS NO 2° CONJUNTO
				System.out.println("\n***INSERIR PRODUTOS NO 2° CONJUNTO****");
				System.out.print("Digite quantos produtos deseja inserir: ");
				qtdProdutos = in.nextInt();
				in.nextLine();
				for(int aux = 0; aux < qtdProdutos; aux++) {
					System.out.print("\nDigite o nome do produto: ");
					nomeProduto = in.nextLine();
					segundoConjunto.inserirProduto( nomeProduto );
				}
				System.out.print("**************************************\n");
				break;
			case 3:// CONSULTAR TODOS PRODUTOS DOS DOIS CONJUNTOS (UNIÃO)
				System.out.print("CONSULTAR TODOS PRODUTOS DOS DOIS CONJUNTOS (UNIÃO)\n");
				
				//Mostra como fica a união dos dois conjuntos, mas não altera nenhum deles
				System.out.println( primeiroConjunto.uniaoConjuntos( segundoConjunto ) );
				
				System.out.print("\n**************************************\n");
				break;
			case 4:// CONSULTAR APENAS PRODUTOS EM COMUM NOS DOIS CONJUNTOS (INTERSECÇÃO)
				System.out.print("CONSULTAR APENAS PRODUTOS EM COMUM NOS DOIS CONJUNTOS (INTERSECÇÃO)\n");
				System.out.println( primeiroConjunto.intersecaoConjuntos( segundoConjunto ) );
				System.out.print("\n**************************************\n");
				break;
			case 5:// CONSULTAR PRODUTOS DO 1° CONJUNTO QUE NÃO EXISTEM NO 2° CONJUNTO (DIFERENÇA)
				System.out.print("CONSULTAR PRODUTOS DO 1° CONJUNTO QUE NÃO EXISTEM NO 2° CONJUNTO (DIFERENÇA)\n");
				System.out.println( primeiroConjunto.diferencaConjuntos( segundoConjunto ) );
				System.out.print("\n**************************************\n");
				break;
			case 6:// CONSULTAR SE O 1° CONJUNTO ESTÁ CONTIDO NO 2° CONJUNTO (VERIFICAÇÃO DE SUBCONJUNTO)
				System.out.print("CONSULTAR SE O 1° CONJUNTO ESTÁ CONTIDO NO 2° CONJUNTO (VERIFICAÇÃO DE SUBCONJUNTO)\n");
				if( segundoConjunto.verificaSubconjunto( primeiroConjunto ) )
					System.out.println("O 1° conjunto está contido no 2° conjunto.");
				else
					System.out.println("O 1° conjunto não está contido no 2° conjunto.");
				System.out.print("\n**************************************\n");
				break;
			case 0:// SAIR
				break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
