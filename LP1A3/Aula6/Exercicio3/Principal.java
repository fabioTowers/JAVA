package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Integer opcao = 5; //Iniciada em um valor fora do intervalo de opções do menu
		boolean aux; //Variavel auxiliar para salvar os retornos de true or false das funções e depois exibir ao usuário
		Pesquisa p = new Pesquisa();
		PesquisaInicio pI = new PesquisaInicio();
		PesquisaFim pF = new PesquisaFim();
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. INFORMAR TEXTO");
			System.out.println("\t2. BUSCAR STRING");
			System.out.println("\t3. BUSCAR STRING NO INÍCIO");
			System.out.println("\t4. BUSCAR STRING NO FIM");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			case 1://INFORMAR TEXTO
				System.out.println("\n************INFORMAR TEXTO************");
				p.setTexto(in.nextLine());
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 2://BUSCAR STRING
				System.out.println("\n************BUSCAR STRING*************");
				System.out.println("O texto salvo é [" + p.getTexto() + "]\n");
				System.out.print("Digite a String: ");
				aux = p.BuscarString(in.nextLine());
				in.nextLine();
				if(aux == true) System.out.println("O texto contém a String informada.");
				else System.out.println("O texto não contém a String informada.");
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 3://BUSCAR STRING NO INÍCIO
				System.out.println("\n*******BUSCAR STRING NO INICIO********");
				System.out.println("O texto salvo é [" + p.getTexto() + "]\n");
				System.out.print("Digite a String: ");
				aux = pI.BuscarString(in.nextLine());
				in.nextLine();
				if(aux == true) System.out.println("O inicio do texto contém a String informada.");
				else System.out.println("O inicio do texto não contém a String informada.");
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 4://BUSCAR STRING NO FIM
				System.out.println("\n*********BUSCAR STRING NO FIM*********");
				System.out.println("O texto salvo é [" + p.getTexto() + "]\n");
				System.out.print("Digite a String: ");
				aux = pF.BuscarString(in.nextLine());
				in.nextLine();
				if(aux == true) System.out.println("O fim do texto contém a String informada.");
				else System.out.println("O fim do texto não contém a String informada.");
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 0://SAIR
			break;
			default://Nenhuma das opções do menu de opções foi digitada
				System.out.println("\n***********Opção Inválida*************");
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
