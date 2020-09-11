package exercicio3;

import java.util.LinkedList;

public class Pilha {

	LinkedList<String> livros = new LinkedList<>();
	
	public void inserirLivro(String nomeDoLivro) {
		livros.addLast(nomeDoLivro);
	}
	
	public void removerLivro() {
		livros.pollLast();
	}
	
	public LinkedList<String> retornaLivros() {
		return livros;
	}
}
