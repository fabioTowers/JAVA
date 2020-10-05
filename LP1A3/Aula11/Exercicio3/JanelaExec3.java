package exercicio3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JanelaExec3 extends JFrame{
	private JLabel lbValorProdutoCampo;
	private JLabel lbEstado;
	private JLabel lbTipoPostagem;
	private JLabel lbValorProdutoResultado;
	private JLabel lbValorFrete;
	private JLabel lbValorTotal;
	
	private JTextField tfValorProdutoCampo;
	
	private JCheckBox ckFidelidade;
	
	private JComboBox<String> cbEstado;
	private static final String valEst[] = {"SP", "RJ", "MG", "ES"};
	
	private static final String valTipoPostagem[] = {"Sedex", "Sedex 10"};
	private JRadioButton rbTipoPostagem[];
	private ButtonGroup bgTipoPostagem;
	
	private JButton btCalcular;
	
	private Container cp;
	
	public JanelaExec3() {
		lbValorProdutoCampo = new JLabel("Valor do Produto");
		lbEstado = new JLabel("Estado");
		lbTipoPostagem = new JLabel("Tipo de postagem");
		
		tfValorProdutoCampo = new JTextField();
		
		ckFidelidade = new JCheckBox("Cliente com fidelidade");
		
		rbTipoPostagem = new JRadioButton[2];
		bgTipoPostagem = new ButtonGroup();
		
		cbEstado = new JComboBox<String>(valEst);
		
		btCalcular = new JButton("Calcular");
		
		lbValorProdutoResultado = new JLabel();
		lbValorFrete = new JLabel();
		lbValorTotal = new JLabel();
		
		setTitle("Exercício 3");
		setSize(600, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int aux=0; aux < rbTipoPostagem.length; aux++) {
			rbTipoPostagem[aux] = new JRadioButton(valTipoPostagem[aux]);
			rbTipoPostagem[aux].setBackground(new Color(180, 205, 205));
			bgTipoPostagem.add(rbTipoPostagem[aux]);
		}
		ckFidelidade.setBackground( new Color(180, 205, 205) );
		btCalcular.setToolTipText("Clique para calcular");
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(180, 205, 205));
		
		lbValorProdutoCampo.setBounds(20, 40, 100, 25);
		tfValorProdutoCampo.setBounds(120, 40, 150, 25);
		ckFidelidade.setBounds(16, 80, 250, 25);
		lbEstado.setBounds(20, 120, 100, 25);
		cbEstado.setBounds(100, 120, 50, 25);
		lbTipoPostagem.setBounds(20, 160, 120, 25);
		rbTipoPostagem[0].setBounds(25, 190, 100, 25);
		rbTipoPostagem[1].setBounds(25, 220, 100, 25);
		btCalcular.setBounds(105, 260, 100, 25);
		lbValorProdutoResultado.setBounds(350, 30, 170, 25);
		lbValorFrete.setBounds(350, 60, 170, 25);
		lbValorTotal.setBounds(350, 90, 170, 25);
		
		cp.add(lbValorProdutoCampo);
		cp.add(tfValorProdutoCampo);
		cp.add(ckFidelidade);
		cp.add(lbEstado);
		cp.add(cbEstado);
		cp.add(lbTipoPostagem);
		cp.add(rbTipoPostagem[0]);
		cp.add(rbTipoPostagem[1]);
		cp.add(btCalcular);
		cp.add(lbValorProdutoResultado);
		cp.add(lbValorFrete);
		cp.add(lbValorTotal);
		
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btCalcularAction(); }
		});
	}//Fim do construtor
	
	public void btCalcularAction() {
		double valProd, valFrete = 0, valTotal;
		String tp=null;
		
		valProd = Float.parseFloat( tfValorProdutoCampo.getText() );
		
		//Cliente tem fidelidade?
		if( ckFidelidade.isSelected() ) {
			valProd = valProd - (valProd * 0.1);//Sim, aplica desconto de 10% no produto
		}
		
		switch( cbEstado.getSelectedItem().toString() ) {
		case "SP":
			valFrete = valProd * 0.1;
			break;
		case "RJ":
			valFrete = valProd * 0.15;
			break;
		case "MG":
			valFrete = valProd * 0.15;
			break;
		case "ES":
			valFrete = valProd * 0.2;
			break;
		}
		
		for(JRadioButton rb : rbTipoPostagem)
			if( rb.isSelected() )
				tp = rb.getText();
		
		switch(tp) {
		case "Sedex":
			
			break;
		case "Sedex 10":
			valFrete = valFrete + (valProd * 0.2);
			break;
		}
		
		valTotal = valFrete + valProd;
		
		lbValorProdutoResultado.setText("Valor do produto: R$ " + valProd);
		lbValorFrete.setText("Valor do frete: R$ " + valFrete);
		lbValorTotal.setText("Valor total: R$ " + valTotal);
	}
	
}//Fim da classe
