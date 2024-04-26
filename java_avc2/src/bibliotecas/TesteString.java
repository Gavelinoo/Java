package bibliotecas;

public class TesteString {
	public static void main(String[] args) {
		String a = new String("Java no Senac");
		String b = new String("Java no Senac");
//		String b = a; // apontando pro mesmo endereço de memoria, faz o hash ficar igual     

		

		if (a==b) { // compara por referencia, pelo endereço de memória, o hash baseado no endereço de memória de cada variavel, ou sejam duas variaveis, dois endereços diferentes.
			System.out.println("a e b sao iguais");
		} else {
			System.out.println("a e b sao diferentes");
		}
		
		int i = 6; // a atribuição de quando a variavel e primitiva é direta, compara o conteudo em si
		int j = 6;
		if (i == j) {
			System.out.println("i e j sao iguais");
		} else {
			System.out.println("i e j sao diferentes");
		}
		
		if (a.equals(b)) {
			System.out.println("a e b sao iguais");
		} else {
			System.out.println("a e b sao diferentes");
		}
		
	}

}
