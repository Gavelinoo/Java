package bibliotecas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main(String[] args) throws IOException { 
		InputStream is = new FileInputStream("teste.txt");
		InputStreamReader isr = new InputStreamReader(is); // saida de um vira a entrada de outro		
		BufferedReader bfr = new BufferedReader(isr);
		
		String s;
		s = bfr.readLine();
		System.out.println(s+"\n");
		
		while(s!=null) { // o leitor ele cria ponteiros, então enquanto o valor não for nullo ele não termian
			System.out.println(s);
			s = bfr.readLine();
		}
			
		
	}
		
}

