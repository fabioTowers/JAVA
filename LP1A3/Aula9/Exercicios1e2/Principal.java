package exercicios1e2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opcao = 25; //Iniciada em um valor fora do intervalo de opções do menu
		String caminho; //Recebe os dados digitados pelo usuário
		String caminho2; //Recebe os dados digitados pelo usuário
		String nome; //Recebe os dados digitados pelo usuário
		Arquivo arquivo = new Arquivo();
		
		while(opcao != 0) {//menu inicial
			System.out.print("**************************************************");
			System.out.println("\n**********************OPÇÕES**********************");
			System.out.println("\t1. Criar arquivo");
			System.out.println("\t2. Excluir arquivo");
			System.out.println("\t3. Renomear arquivo");
			System.out.println("\t4. Mover arquivo");
			System.out.println("\t5. Criar diretório");
			System.out.println("\t6. Excluir diretório");
			System.out.println("\t7. Renomear diretório");
			System.out.println("\t8. Mover diretório");
			System.out.println("\t9. Criar arquivo e escrever");
			System.out.println("\t10. Ler arquivo");
			System.out.println("\t11. Exibir informações sobre um arquivo");
			System.out.println("\t12. Exibir informações sobre um diretório");
			System.out.println("\t13. Exibir todos os arquivos e subdiretórios de um diretório (com caminho)");
			System.out.println("\t0. SAIR");
			System.out.println("\n**************************************************");
			System.out.print("\nDigite o número da opção desejada: ");
			
			try {
				opcao = in.nextInt();
				in.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("A Opção Digitada Inexiste!");
				in.nextLine();
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n******************CRIAR ARQUIVO*******************");
				System.out.print("Digite o caminho para o novo arquivo: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do novo arquivo: ");
				caminho = caminho + "\\" + in.nextLine();
				if( arquivo.criarArquivo(caminho) ) {
					System.out.print("Arquivo criado com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado!\n");
				}
				System.out.print("**************************************************");
				break;
			case 2:
				System.out.println("\n******************EXCLUIR ARQUIVO*****************");
				System.out.print("Digite o caminho: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do arquivo que deseja excluir: ");
				caminho = caminho + "\\" + in.nextLine();
				if( arquivo.excluirArquivo(caminho) ) {
					System.out.print("Arquivo excluido com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível excluir!\n");
				}
				System.out.print("**************************************************");
				break;
			case 3:
				System.out.println("\n*****************RENOMEAR ARQUIVO*****************");
				System.out.print("Digite o caminho: ");
				caminho = in.nextLine();
				nome = caminho + "\\";
				System.out.print("Digite o nome do arquivo que deseja renomear: ");
				caminho = caminho + "\\" + in.nextLine();
				System.out.print("Digite o novo nome do arquivo: ");
				nome = nome + in.nextLine();
				if( arquivo.renomearMoverArquivo(caminho, nome) ) {
					System.out.print("Arquivo renomeado com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível renomear!\n");
				}
				System.out.print("**************************************************");
				break;
			case 4:
				System.out.println("\n******************MOVER ARQUIVO*******************");
				System.out.print("Digite o caminho para o arquivo: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do arquivo que deseja mover: ");
				nome = in.nextLine();
				caminho = caminho + "\\" + nome;
				System.out.print("Digite o novo caminho do arquivo: ");
				caminho2 = in.nextLine() + "\\" + nome;
				if( arquivo.renomearMoverArquivo(caminho, caminho2) ) {
					System.out.print("Arquivo movido com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível mover!\n");
				}
				System.out.print("**************************************************");
				break;
			case 5:
				System.out.println("\n******************CRIAR DIRETÓRIO*****************");
				System.out.print("Digite o caminho para o novo diretorio: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do novo diretorio: ");
				caminho = caminho + "\\" + in.nextLine();
				if( arquivo.criarDiretorio(caminho) ) {
					System.out.print("Diretório criado com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível criar o diretorio!\n");
				}
				System.out.print("**************************************************");
				break;
			case 6:
				System.out.println("\n*****************EXCLUIR DIRETÓRIO****************");
				System.out.print("Digite o caminho para o diretorio a ser excluido: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do diretorio a ser excluido: ");
				caminho = caminho + "\\" + in.nextLine();
				if( arquivo.excluirDiretorio(caminho) ) {
					System.out.print("Diretório excluido com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível excluir o diretorio!\n");
				}
				System.out.print("**************************************************");
				break;
			case 7:
				System.out.println("\n*****************RENOMEAR DIRETÓRIO***************");
				System.out.print("Digite o caminho: ");
				caminho = in.nextLine();
				nome = caminho + "\\";
				System.out.print("Digite o nome do diretorio que deseja renomear: ");
				caminho = caminho + "\\" + in.nextLine();
				System.out.print("Digite o novo nome do diretorio: ");
				nome = nome + in.nextLine();
				if( arquivo.renomearMoverDiretorio(caminho, nome) ) {
					System.out.print("Diretorio renomeado com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível renomear!\n");
				}
				System.out.print("**************************************************");
				break;
			case 8:
				System.out.println("\n******************MOVER DIRETÓRIO*****************");
				System.out.print("Digite o caminho para o diretorio: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do diretorio que deseja mover: ");
				nome = in.nextLine();
				caminho = caminho + "\\" + nome;
				System.out.print("Digite o novo caminho do diretorio: ");
				caminho2 = in.nextLine() + "\\" + nome;
				if( arquivo.renomearMoverDiretorio(caminho, caminho2) ) {
					System.out.print("Diretorio movido com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado, não foi possível mover!\n");
				}
				System.out.print("**************************************************");
				break;
			case 9:
				System.out.println("\n*************CRIAR ARQUIVO E ESCREVER*************");
				System.out.print("Digite o caminho para o novo arquivo: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do novo arquivo: ");
				caminho = caminho + "\\" + in.nextLine();
				System.out.println("Digite o texto que deseja escrever no arquivo: ");
				if( arquivo.criaEscreveArquivo( caminho, in.nextLine() ) ) {
					System.out.print("Arquivo criado com sucesso!\n");
				} else {
					System.out.print("Oops, algo deu errado!\n");
				}
				System.out.print("**************************************************");
				break;
			case 10:
				System.out.println("\n********************LER ARQUIVO*******************");
				System.out.print("Digite o caminho até o arquivo: ");
				caminho = in.nextLine();
				//nome = caminho + "\\";
				System.out.print("Digite o nome do arquivo que deseja ler: ");
				caminho = caminho + "\\" + in.nextLine();
				System.out.println(caminho);
				System.out.print("Deseja ler todas as linhas [t] ou apenas parte [p]: ");
				//nome = in.next();
				//System.out.println(nome);
				if( in.nextLine().equals("t")) {
					arquivo.lerArquivo(caminho, -1);
				} else {
					System.out.println("Digite quantas linhas deseja ler: ");
					arquivo.lerArquivo(caminho, in.nextInt());
					in.nextLine();
				}
				System.out.print("**************************************************");
				break;
			case 11:
				System.out.println("\n********EXIBIR INFORMAÇÕES SOBRE UM ARQUIVO*******");
				System.out.print("Digite o caminho para o arquivo: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do arquivo: ");
				caminho = caminho + "\\" + in.nextLine();
				arquivo.infoArquivo(caminho);
				System.out.print("**************************************************");
				break;
			case 12:
				System.out.println("\n******EXIBIR INFORMAÇÕES SOBRE UM DIRETÓRIO*******");
				System.out.print("Digite o caminho para o diretorio: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do diretorio: ");
				caminho = caminho + "\\" + in.nextLine();
				arquivo.infoDiretorioResumido(caminho);
				System.out.print("**************************************************");
				break;
			case 13:
				System.out.println("\nEXIBIR TODOS OS ARQUIVOS E SUBDIRETÓRIOS DE UM DIRETORIO (COM CAMINHO)");
				System.out.print("Digite o caminho para o diretorio: ");
				caminho = in.nextLine();
				System.out.print("Digite o nome do diretorio: ");
				caminho = caminho + "\\" + in.nextLine();
				arquivo.infoDiretorio(caminho);
				System.out.print("**************************************************");
				break;
			case 0:// SAIR
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
