package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opc = -1;
		Cliente clientes[] = new Cliente[10];
		int aux = 0;
		int procurar = 0;
		String nome;
		String cpf;

		do {
			System.out.println("***MENU***");
			System.out.println("1. Inserir Cliente");
			System.out.println("2. Consultar Cliente Específico");
			System.out.println("3. Consultar Clientes");
			System.out.println("0. SAIR");

			try {
				opc = in.nextInt();
				in.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("A opção digitada é inválida, digite 1, 2, 3 ou 0 para sair.");
			} finally {
				in.nextLine();
			}
			
			switch (opc) {
			case 1:
				Cliente clienteTemp = new Cliente();
				System.out.print("Digite o nome: ");
				nome = in.nextLine();
				in.nextLine();

				System.out.print("\nDigite o cpf: ");
				cpf = in.next();
				in.nextLine();
				
				

				if (clienteTemp.setNome(nome) && clienteTemp.setCpf(cpf)) {
					clienteTemp.setCodigo(aux);
					clientes[aux] = clienteTemp;
					aux++;
				} else {
					System.out.println("Cliente não cadastrado!");
				}
				break;
			case 2:
				try {
					System.out.print("\nDigite o código de um cliente específico: ");
					procurar = in.nextInt();
					in.nextLine();
					int tamanho = clientes.length;
					for (int auxiliar = 0; auxiliar < tamanho; auxiliar++) {
						if (clientes[auxiliar] != null && clientes[auxiliar].getCodigo() == procurar) {
							System.out.println(clientes[auxiliar].getNome() + "\n\t" + clientes[auxiliar].getCpf() + "\n\t"
									+ clientes[auxiliar].getCodigo() + "\n\t");
							break;
						}
					}
				} catch (InputMismatchException e) {
					System.out.println("O código informado é Inválido");
					in.nextLine();
				}
				break;
			case 3:
				int tam = clientes.length;
				for (int auxiliar = 0; auxiliar < tam; auxiliar++) {
					if (clientes[auxiliar] != null) {
						System.out.println(clientes[auxiliar].getNome() + "\n\t" + clientes[auxiliar].getCpf() + "\n\t"
								+ clientes[auxiliar].getCodigo() + "\n\t");
					}
				}
				break;
			case 0:
			break;
			default:
				throw new IllegalArgumentException("A opção digitada é inválida!");
			}

		} while (opc != 0);

		in.close();
	}

}
