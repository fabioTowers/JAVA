package exercicio3;

public class Pesquisa {
	protected static String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}

	public boolean BuscarString(String cadeiaCaracteres) {
		return texto.contains(cadeiaCaracteres);
	}
}
