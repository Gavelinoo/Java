package sistemabancario;

public class TestaConta2Cliente {
	public static void main(String[] args) {
		Conta2 c2 = new Conta2();
		Cliente cliente1 = new Cliente(); // inicializando o cliente, pq não foi instanciado na memória
		c2.cliente = cliente1;
		c2.saldo = 100;
		System.out.println("Saldo: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);
		c2.cliente.nome = "Clayton"; // se não instanciar o cliente vai dar null, pq não instanciou na memoria
		System.out.println("Nome: "+c2.cliente.nome);		
	}

}
