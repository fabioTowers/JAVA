package exercicio2;

import java.util.LinkedList;

public class Fila {

	LinkedList<String> pessoas = new LinkedList<>();
	
	public void inserirPessoa (String nomeDaPessoa) {
		pessoas.add(nomeDaPessoa);
	}
	
	public void removePessoa() {
		pessoas.pollFirst();
	}
	
	public LinkedList<String> retornaPessoas(){
		return pessoas;
	}
}
