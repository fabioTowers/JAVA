package exercicio3;

public class PesquisaInicio extends Pesquisa {
	
	@Override
	public final boolean BuscarString(String cadeiaCaracteres) {
		return texto.startsWith(cadeiaCaracteres);
	}
}
