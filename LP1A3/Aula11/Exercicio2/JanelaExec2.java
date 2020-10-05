package exercicio2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class JanelaExec2 extends JFrame{
	private JLabel lbTemperatura;	//Rótulo do campo de texto Temperatura
	private JTextField tfTemperatura;	//Campo de texto
	private JLabel lbOperacoes;
	private JRadioButton rbOperacoes[];
	private ButtonGroup bgOperacoes; //Grupo de botões para agrupar os JRadioButtons
	private static final String valDef[] = {"Celsius para Fahrenheit",
											"Fahrenheit para Celsius",
											"Celsius para Kelvin",
											"Kelvin para Celsius",
											"Fahrenheit para Kelvin",
											"Kelvin para Fahrenheit"}; //Valores dos JRadioButtons 
	
	private Container cp;	//Container dos elementos da janela
	
	public JanelaExec2() {
		lbTemperatura = new JLabel("Temperatura");	//Inicializando o construtor do rótilo do campo Temperatura
		tfTemperatura = new JTextField();	//Inicializando o construtor do campo de texto
		lbOperacoes = new JLabel("Operações");
		bgOperacoes = new ButtonGroup();
		rbOperacoes = new JRadioButton[6];
		
		
		//Configuração dos componentes da janela
		setTitle("Exercício 2"); //Título da janela
		setSize(500, 300); //Tamanhao da janela em pixels
		setLocationRelativeTo(null); //Centraliza a janela na tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando a janela é fechada os recursos que ela utiliza são liberados
		for(int aux=0; aux < rbOperacoes.length; aux++) {//Adiciona os valores aos JRadioButtons
			rbOperacoes[aux] = new JRadioButton(valDef[aux]);
			rbOperacoes[aux].setBackground( new Color(180, 205, 205) );//Cor de fundo dos JRadioButtons
			bgOperacoes.add(rbOperacoes[aux]);// Adiciona os JRadioButtons ao ButtonGroup
		}
		cp = getContentPane(); //Instancia o container da janela
		cp.setLayout(null); // Configura o layout do container como null
		cp.setBackground( new Color(180, 205, 205) ); // Configura a cor de fundo do Container
		
		//Posicionando os componentes na janela
		lbTemperatura.setBounds(20, 40, 100, 25);
		tfTemperatura.setBounds(100, 40, 360, 25);
		lbOperacoes.setBounds(20, 80, 100, 25);
		rbOperacoes[0].setBounds(100, 80, 200, 25);
		rbOperacoes[1].setBounds(100, 100, 200, 25);
		rbOperacoes[2].setBounds(100, 120, 200, 25);
		rbOperacoes[3].setBounds(100, 140, 200, 25);
		rbOperacoes[4].setBounds(100, 160, 200, 25);
		rbOperacoes[5].setBounds(100, 180, 200, 25);
		
		cp.add(lbTemperatura);
		cp.add(tfTemperatura);
		cp.add(lbOperacoes);
		cp.add(rbOperacoes[0]);
		cp.add(rbOperacoes[1]);
		cp.add(rbOperacoes[2]);
		cp.add(rbOperacoes[3]);
		cp.add(rbOperacoes[4]);
		cp.add(rbOperacoes[5]);
		
		//Declarando os eventos
		//Evento: alterar o combobox Operacoes
		/*rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperZeroAction(); }
		});
		rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperUmAction(); }
		});
		rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperDoisAction(); }
		});
		rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperTresAction(); }
		});
		rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperQuatroAction(); }
		});
		rbOperacoes.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperCincoAction(); }
		});*/
		rbOperacoes[0].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
		rbOperacoes[1].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
		rbOperacoes[2].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
		rbOperacoes[3].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
		rbOperacoes[4].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
		rbOperacoes[5].addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) { rbOperacoesAction(); }
		});
	}//fim do construtor
	
	private void rbOperacoesAction() {
		String op=null;
		double a, resultado;
		for(JRadioButton rb : rbOperacoes) {
			if(rb.isSelected()) {
				op = rb.getText();
			}
		}
		
		switch(op) {
		case "Celsius para Fahrenheit":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = a * 1.8 + 32;
			JOptionPane.showMessageDialog(this, a + " °C equivalem a " + resultado + " °F", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Fahrenheit para Celsius":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = (a - 32)/1.8;
			JOptionPane.showMessageDialog(this, a + " °F equivalem a " + resultado + " °C", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Celsius para Kelvin":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = a + 273.15;
			JOptionPane.showMessageDialog(this, a + " °C equivalem a " + resultado + " °K", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Kelvin para Celsius":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = a - 273.15;
			JOptionPane.showMessageDialog(this, a + " °K equivalem a " + resultado + " °C", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Fahrenheit para Kelvin":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = (a + 459.67)/1.8;
			JOptionPane.showMessageDialog(this, a + " °F equivalem a " + resultado + " °K", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Kelvin para Fahrenheit":
			a = Double.parseDouble( tfTemperatura.getText() );
			resultado = a * 1.8 - 459.67;
			JOptionPane.showMessageDialog(this, a + " °K equivalem a " + resultado + " °F", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		}//fim do switch
	}//Fim do método rbOperacoesAction()
	
}//fim da classe
