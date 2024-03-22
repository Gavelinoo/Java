package sistemabancario;

public class TestaConta {
	public static void main(String[] args) {
//		Conta c1; // declarei o objeto c1 do tipo classe Conta
//		c1 = new Conta(); // Construção / Instanciação
		Conta c1 = new Conta(); // delcaração e instanciação na mesma linha 
		
		//Falta inicialização
		c1.numero = 001;
		c1.nome = "Clayton";
		c1.saldo = 100.0;
		c1.limite = 10.0;
		
		System.out.println("Número da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("limite: "+c1.limite);
		
	}

}
