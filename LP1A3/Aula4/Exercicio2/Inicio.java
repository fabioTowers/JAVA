package exercicio2;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario1 = new Funcionario();
		funcionario1.salario = 3500;
		Funcionario funcionario2 = funcionario1;
		funcionario2.salario += 800;
		Funcionario funcionario3 = funcionario2;
		funcionario2.salario += 400;
		
		System.out.println(funcionario1.salario);
		System.out.println(funcionario2.salario);
		System.out.println(funcionario3.salario);
		
		System.out.println(funcionario1);
		System.out.println(funcionario1);
		System.out.println(funcionario1);
	}

}

/*
 * RESPOSTAS:
 * 
 * A) Foram criadas 3 inst�ncias e um objeto.
 * 
 * B)Foram criadas as inst�ncias funcionario1, funcionario2 e funcionario3
 * 
 * C)15DB9742
 * */
