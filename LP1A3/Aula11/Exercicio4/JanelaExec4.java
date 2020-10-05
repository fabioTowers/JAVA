package exercicio4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class JanelaExec4 extends JFrame{
	private JMenuBar mbBarra;
	private JMenu mnCadastro;
	
	private JMenuItem miClientes[];
	private JMenu mnClientes;
	private static final String cadClientesItens[] = {"Pessoa Física", "Pessoa Jurídica"};
	private JMenuItem miFornecedores;
	private JMenuItem miSair;
	
	public JanelaExec4() {
		mbBarra = new JMenuBar();
		mnCadastro = new JMenu("Cadastro");
		miClientes = new JMenuItem[2];
		mnClientes = new JMenu("Clientes");
		miFornecedores = new JMenuItem("Fornecedores");
		miSair = new JMenuItem("Sair");
		
		setTitle("Exercício 4");
		setSize(500, 300);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(180, 205, 205));
		for(int aux=0; aux < miClientes.length; aux++) {
			miClientes[aux] = new JMenuItem(cadClientesItens[aux]);
			mnClientes.add(miClientes[aux]);
		}
		mnCadastro.add(mnClientes);
		mnCadastro.add(miFornecedores);
		mnCadastro.addSeparator();
		mnCadastro.add(miSair);
		mbBarra.add(mnCadastro);
		setJMenuBar(mbBarra);
		
		miClientes[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {miPessoaFisica(); }
		});
		
		miClientes[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {miPessoaJuridica(); }
		});
		
		miFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {miFornecedores(); }
		});
		
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {miSair(); }
		});
	}//Fim do construtor
	
	public void miPessoaFisica() {
		/*
		 * O método invokeLater da classe SwingUtilities é usado para que a instanciação
		 * e exibição da janela sejam feitas de forma assíncrona (em elementos diferentes),
		 * assim a JVM pode processar os eventos da janela de forma adequada*/
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() { // Implementa o método run da interface Runnable
				//Instância a janela e setVisible(true) exibe a janela
				new JanelaPessoaFisica().setVisible(true);
			}//método run
		});//swing utilities
	}//Fim do método miPessoaFisica
	
	public void miPessoaJuridica() {
		/*
		 * O método invokeLater da classe SwingUtilities é usado para que a instanciação
		 * e exibição da janela sejam feitas de forma assíncrona (em elementos diferentes),
		 * assim a JVM pode processar os eventos da janela de forma adequada*/
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() { // Implementa o método run da interface Runnable
				//Instância a janela e setVisible(true) exibe a janela
				new JanelaPessoaJuridica().setVisible(true);
			}//método run
		});//swing utilities
	}//Fim do método miPessoaJuridica
	
	public void miFornecedores() {
		/*
		 * O método invokeLater da classe SwingUtilities é usado para que a instanciação
		 * e exibição da janela sejam feitas de forma assíncrona (em elementos diferentes),
		 * assim a JVM pode processar os eventos da janela de forma adequada*/
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() { // Implementa o método run da interface Runnable
				//Instância a janela e setVisible(true) exibe a janela
				new JanelaFornecedores().setVisible(true);
			}//método run
		});//swing utilities
	}//Fim do método miFornecedores
	
	public void miSair() {
		System.exit(0);
	}//Fim do método miSair
}//Fim da classe
