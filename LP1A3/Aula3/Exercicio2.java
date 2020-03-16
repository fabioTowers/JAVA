
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Uma ideia traz outra; o botic�rio imaginou que, uma vez preso o alienista, viriam tamb�m busc�-lo\r\n" + 
				"a ele, na qualidade de c�mplice. Esta ideia foi o melhor dos vesicat�rios. Crispim Soares ergueu-se,\r\n" + 
				"disse que estava bom, que ia sair; e apesar de todos os esfor�os e protestos da consorte vestiu-se e\r\n" + 
				"saiu. Os velhos cronistas s�o un�nimes em dizer que a certeza de que o marido ia colocar-se\r\n" + 
				"nobremente ao lado do alienista consolou grandemente a esposa do botic�rio; e notam com muita\r\n" + 
				"perspic�cia, o imenso poder moral de uma ilus�o; porquanto, o botic�rio caminhou resolutamente\r\n" + 
				"ao pal�cio do governo, n�o � casa do alienista. Ali chegando, mostrou-se admirado de n�o ver o\r\n" + 
				"barbeiro, a quem ia apresentar os seus protestos de ades�o, n�o o tendo feito desde a v�spera por\r\n" + 
				"enfermo. E tossia com algum custo. Os altos funcion�rios que lhe ouviam esta declara��o,\r\n" + 
				"sabedores da intimidade do botic�rio com o alienista, compreenderam toda a import�ncia da\r\n" + 
				"ades�o nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro n�o\r\n" + 
				"tardava; Sua Senhoria tinha ido � Casa Verde, a neg�cio importante, mas n�o tardava. Deram-lhe\r\n" + 
				"cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porf�rio era a de todos os patriotas;\r\n" + 
				"ao que o botic�rio ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria\r\n" + 
				"declarar a Sua Majestade.";
		
		System.out.println(texto.substring(texto.indexOf("E tossia"),texto.indexOf(" Os altos")));
		System.out.println(texto.replace("alienista", "psiquiatra"));
		System.out.println("\n\n");
		System.out.println( texto.replace("Crispim Soares", texto.substring(texto.indexOf("Crispim"),texto.indexOf(" ergueu-se")).toUpperCase() ) );
		System.out.println("\n\nCont�m 'vila': "+texto.contains("vila"));
		System.out.println("Cont�m 'custo': "+texto.contains("custo"));
		System.out.println("Cont�m 'receio': "+texto.contains("receio"));
		
		Integer pos=-1;
		Integer qtd=0;
		do {
		pos = texto.indexOf("n�o", ++pos);
		if(pos != -1) qtd++;
		System.out.println(pos+"\n\n");
		}while(pos != -1);
		System.out.println("\n\n'n�o' aparece "+qtd+" vezes no texto.");
		
		System.out.println("O texto cont�m "+texto.length()+" caracteres.");
		
		System.out.println("O texto cont�m "+( ( texto.length() )- ( (texto.replace(" ", "")).length() ) )+" espa�os.");
	}

}
