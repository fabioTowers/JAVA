package exercicio1;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		Integer codigo;
		String descricao;
		Float preco;
		Boolean ativo;
		
		System.out.println("Digite o codigo: ");
		codigo = in.nextInt();
		in.nextLine();
		
		System.out.println("Digite o descri��o: ");
		descricao = in.next();
		in.nextLine();
		
		System.out.println("Digite o pre�o: ");
		preco = in.nextFloat();
		in.nextLine();
		
		System.out.println("Digite se esta ativo [1/0]: ");
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
