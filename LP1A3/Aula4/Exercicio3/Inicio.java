package exercicio3;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Integer opc = -1;
		Cliente clientes[] = new Cliente[10];
		int aux = 0;
		int procurar;
		String nome;
		String cpf;

		do {
			System.out.println("***MENU***");
			System.out.println("1. Inserir Cliente");
			System.out.println("2. Consultar Cliente Espec�fico");
			System.out.println("3. Consultar Clientes");
			System.out.println("0. SAIR");

			opc = in.nextInt();
			in.nextLine();

			switch (opc) {
			case 1:
				Cliente clienteTemp = new Cliente();
				System.out.println("Digite o nome:");
				nome = in.nextLine();
				in.nextLine();

				System.out.println("Digite o cpf:");
				cpf = in.next();
				in.nextLine();
				
				

				if (clienteTemp.setNome(nome) && clienteTemp.setCpf(cpf)) {
					clienteTemp.setCodigo(aux);
					clientes[aux] = clienteTemp;
					aux++;
				} else {
					System.out.println("Cliente n�o cadastrado!");
				}
				break;
			case 2:
				System.out.println("Digite o c�digo de um cliente espec�fico:");
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
			default:
				if (opc != 0)
					System.out.println("VALOR INV�LIDO!");
			}

		} while (opc != 0);

		in.close();
	}

}
