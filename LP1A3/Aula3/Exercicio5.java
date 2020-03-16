import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String toConvert;
		Integer opc=-1;
		
		System.out.println("Digite a String:");
		toConvert = in.next();
		
		do {
			System.out.println("*****MENU*****");
			System.out.println("1. Coverter para int");
			System.out.println("2. Converter para long");
			System.out.println("3. Converter para float");
			System.out.println("4. Converter para double");
			System.out.println("5. Converter para Calendar (data)");
			System.out.println("6. Converter para Calendar (hora)");
			System.out.println("0. SAIR");
			
			opc = in.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("String para inteiro: "+(Integer.parseInt(toConvert)));
				break;
			case 2:
				System.out.println("String para long: "+(Long.parseLong(toConvert)));
				break;
			case 3:
				System.out.println("String para float: "+(Float.parseFloat(toConvert)));
				break;
			case 4:
				System.out.println("String para double: "+(Double.parseDouble(toConvert)));
				break;
			case 5:
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
				Calendar c = Calendar.getInstance();
				c.setTime(sdf.parse(toConvert));
				System.out.println("String para Calendar (data): "+c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
				break;
			case 6:
				SimpleDateFormat sdf1 = new SimpleDateFormat ("HH:mm");
				Calendar hora = Calendar.getInstance();
				hora.setTime(sdf1.parse(toConvert));
				System.out.println(sdf1.format(hora.getTime()));
				break;
			default:
				if(opc != -1 && opc != 0) System.out.println("Op��o Inv�lida!!");
			}
			
		}while(opc != 0);
		
		in.close();
	}

}
