package exercicio4;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Integer opcao = 5; //Iniciada em um valor fora do intervalo de opções do menu
		String dataInicial; //Recebe o valor digitado pelo usuário
		String dataFinal; //Recebe o valor digitada pelo usuário
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Opções****************");
			System.out.println("\t1. CALCULAR DIAS");
			System.out.println("\t2. CALCULAR HORAS");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			case 1://CALCULAR DIAS
				System.out.println("\n*************CALCULAR DIAS************");
				System.out.print("Digite a data e hora inicial (dd/mm/yy HH:mm): ");
				dataInicial = in.nextLine();
				System.out.print("Digite a data e hora final (dd/mm/yy HH:mm): ");
				dataFinal = in.nextLine();
				Dia diferencaDias = new Dia(dataInicial, dataFinal);
				
				
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 2://CALCULAR HORAS
				System.out.println("\n************CALCULAR HORAS************");
				System.out.print("Digite a data e hora inicial (dd/mm/yy HH:mm): ");
				dataInicial = in.nextLine();
				System.out.print("Digite a data e hora final (dd/mm/yy HH:mm): ");
				dataFinal = in.nextLine();
				Hora diferencaHoras = new Hora(dataInicial, dataFinal);
				
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			case 0://SAIR
			break;
			default://Nenhuma das opções do menu de opções foi digitada
				System.out.print("\n***********Opção Inválida*************");
				System.out.println("\n************************[PRESS. ENTER]");
				in.nextLine();
			break;
			}//switch
		}//while
		
		in.close();
	}//main
}//classe
