package bibliotecas;

public class TesteString4 {
	public static void main(String[] args) {
		String a = "Nao gostei desta roda de samba";
		boolean q = a.isEmpty(); // 
		System.out.println(" o A é vazio ?"+q);
		boolean r = a.contains("desta");
		System.out.println(r);
		a.replace("a", "o"); 
		System.out.println(a); // aplicou em memoria,  mandou imprimir
		String b = a.replace("a", "o"); // substitui o a pelo o
		System.out.println(b);
	}

}
