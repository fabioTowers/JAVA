package exercicio3;

public class PesquisaFim extends Pesquisa {
	@Override
	public final boolean BuscarString(String cadeiaCaracteres) {
		return texto.endsWith(cadeiaCaracteres);
	}
}
