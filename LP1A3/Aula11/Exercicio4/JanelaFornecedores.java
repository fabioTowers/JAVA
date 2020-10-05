package exercicio4;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaFornecedores extends JDialog{
	public JanelaFornecedores() {
		setTitle("Fornecedores");
		setSize(250, 150);
		setLocationRelativeTo(null);
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(180, 205, 205));
	}
}
