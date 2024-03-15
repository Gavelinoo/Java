package java_avc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteIO {
	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in)); // metodo alternativo ao scanner
		String name = "";
		System.out.println("Digite seu nome: ");
		try {
			name = dataIn.readLine(); //readline que lê o buffer inserido lá em cima
		} catch (Exception e) {
			System.out.println("Erro!");
		}
		System.out.println("Olá "+name+"!" );
	}

}
