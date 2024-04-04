package sistemabancario;

public class ContaContador {
	private static int contadorContas;
	public static int getContadorContas() {
		return contadorContas;
	}
	public static void setContadorContas(int contadorContas) { // é estatico,
		ContaContador.contadorContas = contadorContas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente = new Cliente();
			
			
	public ContaContador(String nome, String cpf) { // construtor obrigatório, 
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaContador.contadorContas++;
		
	}

}
