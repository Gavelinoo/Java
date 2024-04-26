package bibliotecas;

public class TesteString3 {
	public static void main(String[] args) {
		String a = "Java no Senac";
		System.out.println(a);
		char c = a.charAt(9); // zero base
		System.out.println("Index numero 9: "+c);
		int i = a.length(); //nzero base, começa do 1
		System.out.println("tamanho da string: "+i);
		String n = a.substring(8); // zero base
		System.out.println("Faz um substring com o numero de index a diante :"+n);
		String m = a.trim();
		System.out.println(m); // Tira os espaços antes e depois da cadeia de caracteres
		int j = a.indexOf("S");
		System.out.println("Imprime o numerodo index do caracter especificado: "+j);
		int k = a.indexOf("s"); // deu negativo porque ele não achou o s minusculo
		System.out.println(k);
		int p = a.lastIndexOf("a"); // se for um que aparece duas vezes ele pega o primeiro
		System.out.println(p);
		
	}

}
