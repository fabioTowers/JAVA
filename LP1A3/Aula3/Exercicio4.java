import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(String.format("%05d", 257));
		
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println(df.format(2350000));
		
		DecimalFormat df_2 = new DecimalFormat("##0.000");
		System.out.println(df_2.format(5.6));
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(1);
		System.out.println(nf.format(1.278));
		
		Calendar data = Calendar.getInstance();
		data.set(2016, 6, 15);
		System.out.println(new DateFormatSymbols().getWeekdays()[data.get(Calendar.DAY_OF_WEEK)]+", "+data.get(Calendar.DAY_OF_MONTH)+"/"+new DateFormatSymbols().getMonths()[data.get(Calendar.MONTH)]+"/"+data.get(Calendar.YEAR));
	}

}
