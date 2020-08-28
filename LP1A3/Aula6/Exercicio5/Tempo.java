package exercicio5;

import java.text.ParseException;

public interface Tempo {
	
	double calcularTempo(String dataIncial, String dataFinal) throws ParseException;

	public String getDataHoraInicial();

	public void setDataHoraInicial(String dataHoraInicial);

	public String getDataHoraFinal();

	public void setDataHoraFinal(String dataHoraFinal);
}
