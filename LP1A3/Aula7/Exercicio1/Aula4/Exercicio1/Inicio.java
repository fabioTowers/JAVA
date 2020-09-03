package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		Integer codigo = null;
		String descricao;
		Float preco = null;
		Boolean ativo;
		
		try {
			System.out.print("Digite o codigo: ");
			codigo = in.nextInt();
			in.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("O código informado não é válido!");
		}
		
		System.out.print("\nDigite o descrição: ");
		descricao = in.next();
		in.nextLine();
		
		try {
			System.out.print("\nDigite o preço: ");
			preco = in.nextFloat();
			in.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("O preço informado não é válido!");
		}
		
		System.out.print("\nDigite se esta ativo [1/0]: ");
		ativo = in.hasNext();
		in.nextLine();
		
		Produto p = new Produto();
		
		p.setCodigo(codigo);
		p.setDescricao(descricao);
		p.setPreco(preco);
		p.setAtivo(ativo);
		
		System.out.println("Os valores salvos em p:");
		System.out.println(p.getCodigo()+"\n"+p.getDescricao()+"\n"+p.getPreco()+"\n"+p.getAtivo());
		
		in.close();
	}

}
