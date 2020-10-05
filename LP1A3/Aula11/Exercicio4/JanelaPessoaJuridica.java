package exercicio4;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaPessoaJuridica extends JDialog{
	public JanelaPessoaJuridica() {
		setTitle("Clientes - Pessoa Jurídica");
		setSize(250, 150);
		setLocationRelativeTo(null);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(180, 205, 205));
	}
}
