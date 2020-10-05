package exercicio4;

import javax.swing.SwingUtilities;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O método invokeLater da classe SwingUtilities é usado para que a instanciação
		 * e exibição da janela sejam feitas de forma assíncrona (em elementos diferentes),
		 * assim a JVM pode processar os eventos da janela de forma adequada*/
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() { // Implementa o método run da interface Runnable
				//Instância a janela e setVisible(true) exibe a janela
				new JanelaExec4().setVisible(true);
			}//método run
		});//swing utilities
	}

}
