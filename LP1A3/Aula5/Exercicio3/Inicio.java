package exercicio3;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opcao = 4; //Iniciada em um valor fora do intervalo de opções do menu
		Scanner in = new Scanner(System.in);
		final Integer qtdRegistros = 10;//Define a quantidade de Clientes que poderá ser adicionada em cada array
		
		boolean[] vetPF = new boolean[qtdRegistros];// Array auxiliar, ajuda a gerenciar os espaços livres no vetor de Clientes Pessoa Física
													//true: há um cliente salvo nessa posição
													//false: não há cliente salvo nessa posição
		PessoaJuridica[] pessoaJuridica = new PessoaJuridica[qtdRegistros];//O array que aramazenará os Clientes
		PessoaJuridica novaPessoaJuridica = new PessoaJuridica(); //Objeto auxiliar, nele será gravada cada novo cliente e depois repassado ao array
		
		boolean[] vetPJ = new boolean[qtdRegistros];// Array auxiliar, ajuda a gerenciar os espaços livres no vetor de Clientes Pessoa Física
													//true: há um cliente salvo nessa posição
													//false: não há cliente salvo nessa posição
		PessoaFisica[] pessoaFisica = new PessoaFisica[qtdRegistros];//O array que aramazenará os Clientes
		PessoaFisica novaPessoaFisica = new PessoaFisica(); //Objeto auxiliar, nele será gravada cada novo cliente e depois repassado ao array
		
		while(opcao != 0) {//menu inicial
			System.out.println("\n****************Gerenciamento de clientes****************");
			System.out.println("\t1. INSERIR CLIENTE");
			System.out.println("\t2. REMOVER CLIENTE");
			System.out.println("\t3. CONSULTAR CLIENTES");
			System.out.println("\t0. SAIR");
			System.out.println("*********************************************************\n");
			System.out.print("\nDigite o número da opção desejada: ");
			
			
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			case 1://Cadastro
				System.out.println("\n********************Cadastrar Cliente********************");
				System.out.print("Cadastro de Pessoa Física [1] ou Jurídica [2]: ");
				switch(in.nextInt()) {
				case 1://Cadastro Pessoa Física
					in.nextLine();
					System.out.print("\nNome: ");
					novaPessoaFisica.setNome( in.nextLine() );
					in.nextLine();
					
					System.out.print("CPF: ");
					novaPessoaFisica.setCpf( in.nextLine() );
					in.nextLine();
					
					System.out.print("Endereço: ");
					novaPessoaFisica.setEndereco( in.nextLine() );
					in.nextLine();
					
					System.out.print("Telefone: ");
					novaPessoaFisica.setTelefone( in.nextLine() );
					in.nextLine();
					
					for(int x=0; x < qtdRegistros; x++) {//percorre o vetor em busca de uma posição marcada como vazia (false)
						if(vetPF[x] == false) {//Verifica se o espaço atual esta vazio (false), se sim adiciona o novo cliente
							pessoaFisica[x] = new PessoaFisica();
							
							pessoaFisica[x].setNome( novaPessoaFisica.getNome() );
							pessoaFisica[x].setCpf( novaPessoaFisica.getCpf() );
							pessoaFisica[x].setEndereco( novaPessoaFisica.getEndereco() );
							pessoaFisica[x].setTelefone( novaPessoaFisica.getTelefone() );
							pessoaFisica[x].setCodigo( x+1 );//O código de cliente sempre corresponde a posição do vetor mais um
							vetPF[x] = true;
							
							System.out.print("\nCliente abaixo inserido com sucesso:\n\t" +
									 "Nome: " + pessoaFisica[x].getNome() + "\n\t" +
									 "CPF: " + pessoaFisica[x].getCpf() + "\n\t" +
									 "Endereço: " + pessoaFisica[x].getEndereco() + "\n\t" +
									 "Telefone: " + pessoaFisica[x].getTelefone() + "\n\t" +
									 "Código: " + pessoaFisica[x].getCodigo() + "\n");
							System.out.print("*******************************************[Press. ENTER]");
							in.nextLine();
							
							break;//Interrope o laço for ao encontrar um espaço vazio no array (marcadp como false no array auxiliar)
						}
					}
				break;
				case 2://Cadastro Pessoa Juridica
					in.nextLine();
					System.out.print("\nRazão Social: ");
					novaPessoaJuridica.setRazaoSocial( in.nextLine() );
					in.nextLine();
					
					System.out.print("CNPJ: ");
					novaPessoaJuridica.setCnpj( in.nextLine() );
					in.nextLine();
					
					System.out.print("Endereço: ");
					novaPessoaJuridica.setEndereco( in.nextLine() );
					in.nextLine();
					
					System.out.print("Telefone: ");
					novaPessoaJuridica.setTelefone( in.nextLine() );
					in.nextLine();
					
					for(int x=0; x < qtdRegistros; x++) {//percorre o vetor em busca de uma posição marcada como vazia (false)
						if(vetPJ[x] == false) {//Verifica se o espaço atual esta vazio (false), se sim adiciona o novo cliente
							pessoaJuridica[x] = new PessoaJuridica();
							
							pessoaJuridica[x].setRazaoSocial( novaPessoaJuridica.getRazaoSocial() );
							pessoaJuridica[x].setCnpj( novaPessoaJuridica.getCnpj() );
							pessoaJuridica[x].setEndereco( novaPessoaJuridica.getEndereco() );
							pessoaJuridica[x].setTelefone( novaPessoaJuridica.getTelefone() );
							pessoaJuridica[x].setCodigo( x+1 );//O código de cliente sempre corresponde a posição do vetor mais um
							vetPJ[x] = true;
							
							System.out.print("\nCliente abaixo inserido com sucesso:\n\t" +
									 "Razão Social: " + pessoaJuridica[x].getRazaoSocial() + "\n\t" +
									 "CNPJ: " + pessoaJuridica[x].getCnpj() + "\n\t" +
									 "Endereço: " + pessoaJuridica[x].getEndereco() + "\n\t" +
									 "Telefone: " + pessoaJuridica[x].getTelefone() + "\n\t" +
									 "Código: " + pessoaJuridica[x].getCodigo() + "\n");
							System.out.print("*******************************************[Press. ENTER]");
							in.nextLine();
							
							break;//Interrope o laço for ao encontrar um espaço vazio no array (marcadp como false no array auxiliar)
						}
					}
				break;
				default://Cadastrar não corresponde a PF nem a PJ
					System.out.println("Opção Inválida!");
					System.out.print("*******************************************[Press. ENTER]");
					in.nextLine();
				break;
				}
			break;
			case 2://Remover Cliente
				int codExcluir = 0;
				System.out.println("\n*********************Remover Cliente*********************");
				System.out.print("Qual cliente deseja excluir Pessoa Fisica [1] ou Pessoa Jurídica[2]: ");
				switch(in.nextInt()) {
				case 1://Remover Cliente Pessoa Física
					System.out.print("\nDigite o código do cliente que deseja excluir: ");
					in.nextLine();
					codExcluir = in.nextInt();
					in.nextLine();
					
					for( int x = 0; x < qtdRegistros; x++) {
						if( vetPF[x] == true ) {//Percorre o vetor em busca das posições que armazenam clientes, indicadas por true
							if( pessoaFisica[x].getCodigo() == codExcluir ) {//O cliente aramazenada nessa posição bate com o codigo a ser excluído?
																			 //SIM: pede confirmação e valida resposta
																			 //NÃO: vai para a próxima posição no vetor e refaz as verificações
								System.out.print("\nCliente:\n\t" +
										 "Nome: " + pessoaFisica[x].getNome() + "\n\t" +
										 "CPF: " + pessoaFisica[x].getCpf() + "\n\t" +
										 "Endereço: " + pessoaFisica[x].getEndereco() + "\n\t" +
										 "Telefone: " + pessoaFisica[x].getTelefone() + "\n\t" +
										 "Código: " + pessoaFisica[x].getCodigo() + "\n");
								
								System.out.print("Deseja realmente excluir o cliente acima [sim = 1/não = 2]: ");
								switch(in.nextInt()) {
								case 1://Sim, remover o cliente encontrado
									pessoaFisica[x].setNome( null );
									pessoaFisica[x].setCpf( null );
									pessoaFisica[x].setEndereco( null );
									pessoaFisica[x].setTelefone( null );
									pessoaFisica[x].setCodigo( null );
									System.out.println("\nCliente Removido com sucesso!");
									System.out.print("*******************************************[Press. ENTER]");
									vetPF[x] = false;
									in.nextLine();
								break;
								case 2://Não, não remover o cliente encontrado
									System.out.println("\nRemoção cancelada!");
									System.out.print("*******************************************[Press. ENTER]");
									in.nextLine();
								break;
								default://Opção teclada não corresponde a confirmar remoção sim ou não
									System.out.println("Opção Inválida!");
									System.out.print("*******************************************[Press. ENTER]");
									in.nextLine();
								break;
								}
								break;//Interrompe o laço for que percorre o vetor, volta ao menu inicial
							}
						}
						else {//Se posição no array esta marcada como vazia não faz nada e verifica a próxima ou...
							if( x == qtdRegistros-1 ) {//...verifica que essa é última, exibe a mensagem e o laço termina
								System.out.println("Código não encontrado!");
								System.out.print("*******************************************[Press. ENTER]");
								in.nextLine();
							}
						}
					}
				break;
				case 2://Remover Cliente Pessoa Jurídica
					System.out.print("\nDigite o código do cliente que deseja excluir: ");
					in.nextLine();
					codExcluir = in.nextInt();
					in.nextLine();
					
					for( int x = 0; x < qtdRegistros; x++) {
						if( vetPJ[x] == true ) {//Percorre o vetor em busca das posições que armazenam clientes, indicadas por true
							if( pessoaJuridica[x].getCodigo() == codExcluir ) {//O cliente aramazenada nessa posição bate com o codigo a ser excluído?
																			 //SIM: pede confirmação e valida resposta
																			 //NÃO: vai para a próxima posição no vetor e refaz as verificações
								System.out.print("\nCliente:\n\t" +
										 "Razão Social : " + pessoaJuridica[x].getRazaoSocial() + "\n\t" +
										 "CNPJ: " + pessoaJuridica[x].getCnpj() + "\n\t" +
										 "Endereço: " + pessoaJuridica[x].getEndereco() + "\n\t" +
										 "Telefone: " + pessoaJuridica[x].getTelefone() + "\n\t" +
										 "Código: " + pessoaJuridica[x].getCodigo() + "\n");
								
								System.out.print("Deseja realmente excluir o cliente acima [sim = 1/não = 2]: ");
								switch(in.nextInt()) {
								case 1://Sim, remover o cliente encontrado
									pessoaJuridica[x].setRazaoSocial( null );
									pessoaJuridica[x].setCnpj( null );
									pessoaJuridica[x].setEndereco( null );
									pessoaJuridica[x].setTelefone( null );
									pessoaJuridica[x].setCodigo( null );
									System.out.println("\nCliente Removido com sucesso!");
									System.out.print("*******************************************[Press. ENTER]");
									vetPJ[x] = false;
									in.nextLine();
								break;
								case 2://Não, não remover o cliente encontrado
									System.out.println("\nRemoção cancelada!");
									System.out.print("*******************************************[Press. ENTER]");
									in.nextLine();
								break;
								default://Opção teclada não corresponde a confirmar remoção sim ou não
									System.out.println("Opção Inválida!");
									System.out.print("*******************************************[Press. ENTER]");
									in.nextLine();
								break;
								}
								break;//Interrompe o laço for que percorre o vetor, volta ao menu inicial
							}
						}
						else {//Se posição no array esta marcada como vazia não faz nada e verifica a próxima ou...
							if( x == qtdRegistros-1 ) {//...verifica que essa é última, exibe a mensagem e o laço termina
								System.out.println("Código não encontrado!");
								System.out.print("*******************************************[Press. ENTER]");
								in.nextLine();
							}
						}
					}
				break;
				default://Remover Cliente não corresponde a PF nem a PJ
					System.out.println("Opção Inválida!");
					System.out.print("*******************************************[Press. ENTER]");
					in.nextLine();
				break;
				}
				
			break;
			case 3://Consultar todos os clientes
				System.out.println("\n********************Consultar Clientes*******************");
				
				System.out.print("Clientes Pessoa Física:");
				for(int x = 0; x < qtdRegistros; x++) {//Percorre todo vetor
					if( vetPF[x] == true) {//Encontrou uma posição que armazena dados (marcada como true no vetor auxiliar)?
						System.out.print("\n\tNome: " + pessoaFisica[x].getNome() + "\n\t" +
						 		 "CPF: " + pessoaFisica[x].getCpf() + "\n\t" +
						 		 "Endereço: " + pessoaFisica[x].getEndereco() + "\n\t" +
						 		 "Telefone: " + pessoaFisica[x].getTelefone() + "\n\t" +
						 		 "Código: " + pessoaFisica[x].getCodigo() + "\n\n");
					}
				}
				
				System.out.print("\nClientes Pessoa Jurídica:");
				for(int x = 0; x < qtdRegistros; x++) {//Percorre todo vetor
					if( vetPJ[x] == true) {//Encontrou uma posição que armazena dados (marcada como true no vetor auxiliar)?
						System.out.print("\n\tRazão Social: " + pessoaJuridica[x].getRazaoSocial() + "\n\t" +
						 		 "CNPJ: " + pessoaJuridica[x].getCnpj() + "\n\t" +
						 		 "Endereço: " + pessoaJuridica[x].getEndereco() + "\n\t" +
						 		 "Telefone: " + pessoaJuridica[x].getTelefone() + "\n\t" +
						 		 "Código: " + pessoaJuridica[x].getCodigo() + "\n\n");
					}
				}
				
				System.out.print("\n*******************************************[Press. ENTER]");
				in.nextLine();
			break;
			case 0:// Sai do loop do menu inicial e encerra o programa
			break;
			default://Nenhuma das opçoes do menu inicial foi digitada 
				System.out.println("Opção Inválida!");
				System.out.print("*******************************************[Press. ENTER]");
				in.nextLine();
			break;
			}//switch
		}//while
		in.close();
	}//main
}//classe
