import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer opc=0;
		Scanner in = new Scanner(System.in);
		float dig;
		Float base;
		Float expoente;
		
		do {
			System.out.println("\tMENU DE OP��ES");
			System.out.println("1. Arredondar n�mero");
			System.out.println("2. Arredondar para o pr�ximo inteiro menor");
			System.out.println("3. Arredondar para o pr�ximo inteiro maior");
			System.out.println("4. Calcular raiz quadrada");
			System.out.println("5. Calcular pot�ncia");
			System.out.println("0. SAIR");
			
			opc = in.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Digite um valor decimal:");
				dig = in.nextFloat();
				in.nextLine();
				System.out.println("O numero arredondado �: "+Math.round(dig));
				break;
				
			case 2:
				System.out.println("Digite um valor decimal:");
				dig = in.nextFloat();
				in.nextLine();
				System.out.println("O numero arredondado para o inteiro mais pr�ximo menor �: "+Math.floor(dig));
				break;
				
			case 3:
				System.out.println("Digite um valor decimal:");
				dig = in.nextFloat();
				in.nextLine();
				System.out.println("O numero arredondado para o inteiro mais pr�ximo maior �: "+Math.ceil(dig));
				break;
				
			case 4:
				System.out.println("Digite um valor para calcular a raiz quadrada:");
				dig = in.nextFloat();
				in.nextLine();
				System.out.println("A raiz quadrada �: "+Math.sqrt(dig));
				break;
				
			case 5:
				System.out.println("Digite o valor da base:");
				base = in.nextFloat();
				in.nextLine();
				System.out.println("Digite o valor do expoente:");
				expoente = in.nextFloat();
				in.nextLine();
				System.out.println("A raiz quadrada �: "+Math.pow(base, expoente));
				break;
				
			default:
				if(opc != 0) {
					System.out.println("Valor Inv�lido!!");
				}
			}
		}while(opc != 0);
		
		in.close();
	}

}
