package exercicio4;

import java.text.ParseException;

public abstract class Tempo {
	private String dataHoraInicial;
	private String dataHoraFinal;
	
	protected abstract double calcularTempo(String dataIncial, String dataFinal) throws ParseException;

	public String getDataHoraInicial() {
		return dataHoraInicial;
	}

	public void setDataHoraInicial(String dataHoraInicial) {
		this.dataHoraInicial = dataHoraInicial;
	}

	public String getDataHoraFinal() {
		return dataHoraFinal;
	}

	public void setDataHoraFinal(String dataHoraFinal) {
		this.dataHoraFinal = dataHoraFinal;
	}
	
	
}
