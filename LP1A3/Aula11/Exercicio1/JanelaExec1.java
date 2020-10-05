import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class JanelaExec1 extends JFrame{
	private JLabel lbValorUm;	//Rótulo do campo de texto Valor 1
	private JTextField tfValorUm;	//Campo de texto
	private JLabel lbValorDois;
	private JTextField tfValorDois;
	private JLabel lbOperacoes;
	private JComboBox<String> cbOperacoes;
	public static final String valOperacoes[] = {"+", "-", "x", "/", "resto"};//Conjunto de operações
	private JButton btCalcular;
	
	private Container cp;	//Container dos elementos da janela
	
	public JanelaExec1() { //Construtor da classe
		lbValorUm = new JLabel("Valor 1");	//Inicializando o construtor do rótilo do campo Valor 1
		tfValorUm = new JTextField();	//Inicializando o construtor do campo de texto
		lbValorDois = new JLabel("Valor 2");
		tfValorDois = new JTextField();
		lbOperacoes = new JLabel("Operação");
		cbOperacoes = new JComboBox<>(valOperacoes);
		btCalcular = new JButton("Calcular");
		
		//Configuração dos componentes da janela
		setTitle("Exercício 1"); //Título da janela
		setSize(500, 300); //Tamanhao da janela em pixels
		setLocationRelativeTo(null); //Centraliza a janela na tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando a janela é fechada os recursos que ela utiliza são liberados
		btCalcular.setToolTipText("Clique para ver o resultado");//Inclui uma dica no botão
		
		
		cp = getContentPane(); //Instancia o container da janela
		cp.setLayout(null); // Configura o layout do container como null
		cp.setBackground( new Color(180, 205, 205) ); // Configura a cor de fundo do Container
		
		//Posicionando os componentes na janela
		lbValorUm.setBounds(20, 40, 100, 25);
		tfValorUm.setBounds(100, 40, 360, 25);
		lbValorDois.setBounds(20, 80, 100, 25);
		tfValorDois.setBounds(100, 80, 360, 25);
		lbOperacoes.setBounds(20, 120, 360, 25);
		cbOperacoes.setBounds(100, 120, 70, 25);
		btCalcular.setBounds(200, 120, 100, 25);
		
		//Adicionando os componentes de interface ao container
		cp.add(lbValorUm);
		cp.add(tfValorUm);
		cp.add(lbValorDois);
		cp.add(tfValorDois);
		cp.add(lbOperacoes);
		cp.add(cbOperacoes);
		cp.add(btCalcular);
		
		//Declarando os eventos
		//Evento: alterar o combobox Operacoes
		btCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { btCalcularAction(); }
		});
	}//construtor
	
	private void btCalcularAction() {
		float a, b, resultado;
		int resultadoInteiro, aInt, bInt;
		switch( cbOperacoes.getSelectedItem().toString() ) {
		case "+":
			try {
				a = Float.parseFloat( tfValorUm.getText() );
				b = Float.parseFloat( tfValorDois.getText() );
				resultado = a + b;
				JOptionPane.showMessageDialog(this, a + " + " + b + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(this, "Verifique se os campos Valor 1 e Valor 2 possuem valores válidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "-":
			try {
				a = Float.parseFloat( tfValorUm.getText() );
				b = Float.parseFloat( tfValorDois.getText() );
				resultado = a - b;
				JOptionPane.showMessageDialog(this, a + " - " + b + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(this, "Verifique se os campos Valor 1 e Valor 2 possuem valores válidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "x":
			try {
				a = Float.parseFloat( tfValorUm.getText() );
				b = Float.parseFloat( tfValorDois.getText() );
				resultado = a * b;
				JOptionPane.showMessageDialog(this, a + " x " + b + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(this, "Verifique se os campos Valor 1 e Valor 2 possuem valores válidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "/":
			try {
				a = Float.parseFloat( tfValorUm.getText() );
				b = Float.parseFloat( tfValorDois.getText() );
				resultado = a / b;
				JOptionPane.showMessageDialog(this, a + " / " + b + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(this, "Verifique se os campos Valor 1 e Valor 2 possuem valores válidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "resto":
			try {
				aInt = Integer.parseInt( tfValorUm.getText() );
				bInt = Integer.parseInt( tfValorDois.getText() );
				resultadoInteiro = aInt % bInt;
				JOptionPane.showMessageDialog(this,"O resto da divisão de " + aInt + " por " + bInt + " é " + resultadoInteiro, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			} catch( NumberFormatException e ) {
				JOptionPane.showMessageDialog(this, "Verifique se os campos Valor 1 e Valor 2 possuem valores válidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		}
	}
}
