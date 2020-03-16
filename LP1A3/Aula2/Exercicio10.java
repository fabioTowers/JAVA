package exercicios_2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] dados = new String[10][4];
		String pesquisa;
		int opc;
		
		Scanner in = new Scanner(System.in);
		
		//Cadastrar os dados
		for(int pessoa = 0; pessoa<=10; pessoa++) {
			System.out.print("Cadastre o "+ (pessoa+1) +"� cliente:\n");
			
			System.out.println("nome: ");
			dados[pessoa][0] = in.next();
			in.nextLine();
			
			System.out.println("CPF: ");
			dados[pessoa][1] = in.next();
			in.nextLine();
			
			System.out.println("telefone: ");
			dados[pessoa][2] = in.next();
			in.nextLine();
			
			System.out.println("email: ");
			dados[pessoa][3] = in.next();
			in.nextLine();
			
			System.out.println("***********************************");
		}
		
		//Mostrar os dados
		for(int pessoa = 0; pessoa<=10; pessoa++) {
			System.out.print("Pessoa n� "+(pessoa+1)+":\n\t"+dados[pessoa][0]+"\n\t"+dados[pessoa][1]+"\n\t"+dados[pessoa][2]+"\n\t"+dados[pessoa][3]+"\n\n");
		}
		
		System.out.print("\n\nDeseja pesquisar por nome[1], CPF[2], e-mail[3] ou telefone[4]: ");
		
			opc = in.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("Digite um nome para pesquisar:");
			pesquisa = in.next();
			in.nextLine();
			for(int pessoa = 0; pessoa<=10; pessoa++) {
				if( pesquisa.equalsIgnoreCase(dados[pessoa][0]) ) {
					System.out.print("Pessoa n� "+(pessoa+1)+":\n\t"+dados[pessoa][0]+"\n\t"+dados[pessoa][1]+"\n\t"+dados[pessoa][2]+"\n\t"+dados[pessoa][3]+"\n\n");
					break;
				}
			}
			break;
		case 2:
			System.out.println("Digite um CPF para pesquisar:");
			pesquisa = in.next();
			in.nextLine();
			for(int pessoa = 0; pessoa<=10; pessoa++) {
				if( pesquisa.equalsIgnoreCase(dados[pessoa][1]) ) {
					System.out.print("Pessoa n� "+(pessoa+1)+":\n\t"+dados[pessoa][0]+"\n\t"+dados[pessoa][1]+"\n\t"+dados[pessoa][2]+"\n\t"+dados[pessoa][3]+"\n\n");
					break;
				}
			}
			break;
		case 3:
			System.out.println("Digite um e-mail para pesquisar:");
			pesquisa = in.next();
			in.nextLine();
			for(int pessoa = 0; pessoa<=10; pessoa++) {
				if( pesquisa.equalsIgnoreCase(dados[pessoa][3]) ) {
					System.out.print("Pessoa n� "+(pessoa+1)+":\n\t"+dados[pessoa][0]+"\n\t"+dados[pessoa][1]+"\n\t"+dados[pessoa][2]+"\n\t"+dados[pessoa][3]+"\n\n");
					break;
				}
			}
			break;
		case 4:
			System.out.println("Digite um telefone para pesquisar:");
			pesquisa = in.next();
			in.nextLine();
			for(int pessoa = 0; pessoa<=10; pessoa++) {
				if( pesquisa.equalsIgnoreCase(dados[pessoa][2]) ) {
					System.out.print("Pessoa n� "+(pessoa+1)+":\n\t"+dados[pessoa][0]+"\n\t"+dados[pessoa][1]+"\n\t"+dados[pessoa][2]+"\n\t"+dados[pessoa][3]+"\n\n");
					break;
				}
			}
			break;
		}
		
		in.close();
	}

}
