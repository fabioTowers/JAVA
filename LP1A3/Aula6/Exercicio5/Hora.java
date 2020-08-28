package exercicio5;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Hora implements Tempo {
	private String dataInicial;
	private String dataFinal;
	private double diferenca;//Variavel auxiliar para o calculo em calcularTempo()
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy HH:mm");
	Calendar d_inicial = Calendar.getInstance();
	Calendar d_final = Calendar.getInstance();
	DecimalFormat df = new DecimalFormat("###0.00");//Formata o valor final para duas casas decimais após a virgula
	
	public Hora(String dataInicial, String dataFinal) throws ParseException {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		
		System.out.println("A diferença entra as datas é de " + df.format(calcularTempo(dataInicial, dataFinal)) + " horas");
	}

	@Override
	public double calcularTempo(String dataIncial, String dataFinal) throws ParseException {
		// TODO Auto-generated method stub
		d_inicial.setTime(sdf.parse(dataInicial));
		d_final.setTime(sdf.parse(dataFinal));
		diferenca = d_final.getTimeInMillis();
		diferenca = ((diferenca - d_inicial.getTimeInMillis()) /  (60 * 60 * 1000));
		return diferenca;
	}

	@Override
	public String getDataHoraInicial() {
		// TODO Auto-generated method stub
		return dataInicial;
	}

	@Override
	public void setDataHoraInicial(String dataInicial) {
		// TODO Auto-generated method stub
		this.dataInicial = dataInicial;
	}

	@Override
	public String getDataHoraFinal() {
		// TODO Auto-generated method stub
		return dataFinal;
	}

	@Override
	public void setDataHoraFinal(String dataFinal) {
		// TODO Auto-generated method stub
		this.dataFinal = dataFinal;
	}
}
