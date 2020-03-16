package exercicios_2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String anoDigitado;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um m�s do ano: ");
		anoDigitado = in.next();
		
		anoDigitado.toLowerCase();
		
		switch(anoDigitado) {
		case "janeiro":
		case "fevereiro":
		case "mar�o":
			System.out.println("\nA esta��o predominante � o ver�o!");
			break;
		case "abril":
		case "maio":
		case "junho":
			System.out.println("\nA esta��o predominante � o outono!");
			break;
		case "julho":
		case "agosto":
		case "setembro":
			System.out.println("\nA esta��o predominante � o inverno!");
			break;
		case "outubro":
		case "novembro":
		case "dezembro":
			System.out.println("\nA esta��o predominante � a primavera!");
			break;
		default:
			System.out.println("Valor digitado invalido!!");
		}
		
		in.close();
	}

}
