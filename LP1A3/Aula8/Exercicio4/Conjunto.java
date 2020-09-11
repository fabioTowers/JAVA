package exercicio4;

import java.util.TreeSet;

public class Conjunto {

	TreeSet<String> conjuntoDeProdutos = new TreeSet<>();
		
	public void inserirProduto(String novoProduto) {
		conjuntoDeProdutos.add(novoProduto);
	}
	
	public TreeSet<String> retornaProdutos() {
		return conjuntoDeProdutos;
	}
	
	public TreeSet<String> uniaoConjuntos( Conjunto nomeConjunto ) {
		TreeSet<String> conjuntoAuxiliar = new TreeSet<>();
		
		for(String aux : conjuntoDeProdutos)
			conjuntoAuxiliar.add( aux );

		conjuntoAuxiliar.addAll( nomeConjunto.retornaProdutos() );
		return conjuntoAuxiliar;
	}
	
	public TreeSet<String> intersecaoConjuntos( Conjunto nomeConjunto ){
		TreeSet<String> conjuntoAuxiliar = new TreeSet<>();
		
		for(String aux : conjuntoDeProdutos)
			conjuntoAuxiliar.add( aux );
		
		conjuntoAuxiliar.retainAll( nomeConjunto.retornaProdutos() );
		return conjuntoAuxiliar;
	}
	
	public TreeSet<String> diferencaConjuntos( Conjunto nomeConjunto ){
		TreeSet<String> conjuntoAuxiliar = new TreeSet<>();
		
		for(String aux : conjuntoDeProdutos)
			conjuntoAuxiliar.add( aux );
		
		conjuntoAuxiliar.removeAll( nomeConjunto.retornaProdutos() );
		return conjuntoAuxiliar;
	}
	
	public boolean verificaSubconjunto( Conjunto nomeConjunto ) {
		return conjuntoDeProdutos.containsAll( nomeConjunto.retornaProdutos() );
	}
}
