package exercicio2;

public class Calculo {
	public static double ExecutarCalculo(double num) {//Calcular raiz quadrada
		return Math.sqrt(num);
	}
	
	public static double ExecutarCalculo(double base, double expoente) {//Calcular potenciação
		return Math.pow(base, expoente);
	}
	
	public static int ExecutarCalculo(int num) {//Calcular fatorial
		int result = num;
		while (num > 1){
			result = result *(num-1);
			num--;
		}
		return result;
	}
}
