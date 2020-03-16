import java.util.Calendar;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Calendar data_hora = Calendar.getInstance();
		Integer opc=-1;
		
		System.out.println("Digite o dia: ");
		data_hora.set(Calendar.DAY_OF_MONTH, in.nextInt());
		in.nextLine();
		
		System.out.println("Digite o m�s: ");
		data_hora.set(Calendar.MONTH, in.nextInt());
		in.nextLine();
		
		System.out.println("Digite o ano: ");
		data_hora.set(Calendar.YEAR, in.nextInt());
		in.nextLine();
		
		System.out.println("Digite a hora: ");
		data_hora.set(Calendar.HOUR, in.nextInt());
		in.nextLine();
		
		System.out.println("Digite os minutos: ");
		data_hora.set(Calendar.MINUTE, in.nextInt());
		in.nextLine();

		do {
			System.out.println("******MENU*******");
			System.out.println("1. Adicionar dias");
			System.out.println("2. Adicionar meses");
			System.out.println("3. Adicionar anos");
			System.out.println("4. Adicionar horas");
			System.out.println("5. Adicionar minutos");
			System.out.println("6. Subtrair dias");
			System.out.println("7. Subtrair meses");
			System.out.println("8. Subtrair anos");
			System.out.println("9. Subtrair horas");
			System.out.println("10. Subtrair minutos");
			System.out.println("11. Obter dia da semana");
			System.out.println("0. SAIR");
			
			opc = in.nextInt();
			in.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Dias a serem adicionados: ");
				data_hora.set(Calendar.DAY_OF_MONTH, data_hora.get(Calendar.DAY_OF_MONTH)+in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 2:
				System.out.println("Meses a serem adicionados: ");
				data_hora.set(Calendar.MONTH, data_hora.get(Calendar.MONTH)+in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 3:
				System.out.println("Anos a serem adicionados: ");
				data_hora.set(Calendar.YEAR, data_hora.get(Calendar.YEAR)+in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 4:
				System.out.println("Horas a serem adicionados: ");
				data_hora.set(Calendar.HOUR_OF_DAY, data_hora.get(Calendar.HOUR_OF_DAY)+in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 5:
				System.out.println("Minutos a serem adicionados: ");
				data_hora.set(Calendar.MINUTE, data_hora.get(Calendar.MINUTE)+in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 6:
				System.out.println("Dias a serem subtraidos: ");
				data_hora.set(Calendar.DAY_OF_MONTH, data_hora.get(Calendar.DAY_OF_MONTH)-in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 7:
				System.out.println("Meses a serem subtraidos: ");
				data_hora.set(Calendar.MONTH, data_hora.get(Calendar.MONTH)-in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 8:
				System.out.println("Anos a serem subtraidos: ");
				data_hora.set(Calendar.YEAR, data_hora.get(Calendar.YEAR)-in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 9:
				System.out.println("Horas a serem subtraidas: ");
				data_hora.set(Calendar.HOUR_OF_DAY, data_hora.get(Calendar.HOUR_OF_DAY)-in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 10:
				System.out.println("Minutos a serem subtraidos: ");
				data_hora.set(Calendar.MINUTE, data_hora.get(Calendar.MINUTE)-in.nextInt());
				in.nextLine();
				System.out.println(data_hora.get(Calendar.DAY_OF_MONTH)+"/"+data_hora.get(Calendar.MONTH)+"/"+data_hora.get(Calendar.YEAR)+" - "+data_hora.get(Calendar.HOUR)+":"+data_hora.get(Calendar.MINUTE));
				break;
			case 11:
				System.out.println("Dia da Semana: "+data_hora.get(Calendar.DAY_OF_WEEK));
				break;
			default:
				if(opc != -1 && opc != 0) System.out.println("Op��o Inv�lida!!");
			}
			
		}while(opc != 0);
		
		in.close();
	}

}
