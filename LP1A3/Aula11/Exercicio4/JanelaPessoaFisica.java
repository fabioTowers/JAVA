package exercicio4;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaPessoaFisica extends JDialog{
	
	
	public JanelaPessoaFisica() {
		setTitle("Clientes - Pessoa Física");
		setSize(250, 150);
		setLocationRelativeTo(null);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(180, 205, 205));
	}
}
