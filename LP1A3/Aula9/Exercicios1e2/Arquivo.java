package exercicios1e2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Arquivo {

	
	public boolean criarArquivo(String path) {
		File arq = new File(path);
		if(!arq.exists()) {
			try {
				if(arq.createNewFile()) {
					return true;
				}
				return false;
			} catch(IOException e) {
				System.out.println(e.getMessage());
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean excluirArquivo(String path) {
		File arq = new File(path);
		if(arq.exists()) {
			if(arq.delete()) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}
	
	public boolean renomearMoverArquivo(String originalPath, String newPath) {
		File arq1 = new File(originalPath);
		File arq2 = new File(newPath);
		if(arq1.exists()) {
			if(arq1.renameTo(arq2)) {
				return true;
			} else {
			return false;
			}
		}
		return false;
	}
	
	public boolean criarDiretorio(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			if(dir.mkdir()) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}
	
	public boolean excluirDiretorio(String path) {
		File dir = new File(path);
		if(dir.exists()) {
			if(dir.delete()) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}
	
	public boolean renomearMoverDiretorio(String originalPath, String newPath) {
		File dir1 = new File(originalPath);
		File dir2 = new File(newPath);
		if(dir1.exists()) {
			if(dir1.renameTo(dir2)) {
				return true;
			} else {
			return false;
			}
		}
		return false;
	}
	
	public boolean criaEscreveArquivo(String path, String text) {
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text);
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void lerArquivo(String path, int qtd) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(path);
			if(qtd>0) {
				int aux=1;
				path = br.readLine();
				while( aux <= qtd && path != null) {
					System.out.println(path);
					path = br.readLine();
					aux ++;
				}
				br.close();

			} else {
				path = br.readLine();
				while( path != null) {
					System.out.println(path);
					path = br.readLine();
				}
				
				br.close();

			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public void infoArquivo(String path) {
		File arq = new File(path);
		if(arq.exists()) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(arq.lastModified());
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			System.out.println("Última modificação: " + dataHora);
			System.out.println("Caminho: " + arq.getPath());
			System.out.println("Diretório pai: " + arq.getParent());
			System.out.println("Tamanho: " + arq.length() + " bytes");
		} else {
			System.out.println("O arquivo não existe.");
		}
	}
	
	public void infoDiretorioResumido(String path) {
		File arq = new File(path);
		if(arq.exists()) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(arq.lastModified());
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			System.out.println("Última modificação: " + dataHora);
			System.out.println("Caminho: " + arq.getPath());
			System.out.println("Diretório pai: " + arq.getParent());
		} else {
			System.out.println("O arquivo não existe.");
		}
	}
	
	public void infoDiretorio(String path) {
		File arq = new File(path);
		if(arq.exists()) {

			System.out.println("Arquivos e diretorios existentes: ");
			
			for(String a : arq.list())
				System.out.println(a);
			
			System.out.println("Arquivos e diretorios existentes + caminho:\n");
			
			for(File a : arq.listFiles())
				System.out.println(a);
			
		} else {
			System.out.println("O arquivo não existe.");
		}
	}
}
