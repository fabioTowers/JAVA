package exercicio1;

import java.util.ArrayList;

public class Lista {

	ArrayList<String> produtos = new ArrayList<>();
	
	public void inserirProduto(String novoProduto) {
		produtos.add(novoProduto);
	}
	
	public void inserirProduto(int posicao, String novoProduto) {
		produtos.add(posicao, novoProduto);
	}
	
	public boolean consultarNomeProduto(String nomeProduto) {
		return produtos.contains(nomeProduto);
	}
	
	public String consultarPosicaoProduto(int posicao) {
		return produtos.get(posicao);
	}
	
	public void substituiProduto(int posicao, String novoProduto) {
		produtos.set(posicao, novoProduto);
	}
	
	public void removeProduto(String produto) {
		produtos.remove(produto);
	}
	
	public void removeProduto(int posicaoProduto) {
		produtos.remove(posicaoProduto);
	}
	
	public ArrayList<String> retornaProdutos() {
		return produtos;
	}
}
