package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in; // InputStream sabe capturar um byte, nesse caso recebendo-o da entrada padrão do sistema
		InputStreamReader isr = new InputStreamReader(is); // saida de um vira a entrada de outro
		// InputStreamReader sabe receber um byte e transforma-lo em char
		
		BufferedReader bfr = new BufferedReader(isr);
		// BufferedReader saber receber varios chars e armazena-los num buffer, transformando-os em String
		String s;
		
		try {
			s = bfr.readLine();
			System.out.println("Você digitou a tecla "+s);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
