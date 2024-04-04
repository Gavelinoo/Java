package sistemabancario;

public class TestaContaContador {
	public static void main(String[] args) {
		ContaContador c1 = new ContaContador("Clayton", "111.111.222-11");
		System.out.println("Nome do cliente: "+c1.getCliente());
		int contador = c1.getContadorContas();
		System.out.println("Até agora temos "+contador+ "clientes");
		
		ContaContador c2 = new ContaContador("Maria", "112.112.112-22");
		System.out.println("Nome do cliente: "+c2.getCliente());
		contador = c2.getContadorContas(); //uso o objeto
		System.out.println("Ate agora temos "+contador+ "cliente");
		
	System.out.println("Até agora temos "+ContaContador.getContadorContas()); // usou a classe, metodo classe
		
	}

}
