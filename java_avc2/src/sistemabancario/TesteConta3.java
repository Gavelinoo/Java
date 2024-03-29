package sistemabancario;

public class TesteConta3 {
	public static void main(String[] args) {
//		Conta c1 = new Conta();
//		c1.nome = "Clayton";
//		
//		Conta c2 = new Conta();
//		c2.nome = "Clayton";
// pq ta dando diferente ? Quando a comparação é feita com tipo primitivo,
//		ele compara o conteúdo do ponteiro dele
		int c1 = 10;
		int c2 = 10;
		
		if (c1 == c2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São Diferentes");
		}
	}

}
