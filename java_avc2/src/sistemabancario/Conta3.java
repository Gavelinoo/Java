package sistemabancario;

public abstract class Conta3 {
	int numero;
//	String nome;
	Cliente cliente; // criando uma variavel do tipo cliente dentro de conta, associando classes, não cria automaticamente se 
	double saldo;
	double limite;
	
	abstract double correção();
	
	
		
//		void sacar(double valor) {
//			double saldoAlterado = saldo - valor;
//			saldo = saldoAlterado ;
//		}
		
	public Conta3() {
		cliente = new Cliente(); // construtor que instancia o cliente obrigatoriamente
	}

	boolean sacar (double valor) {
		if (valor > this.saldo + this.limite) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
		
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
//		this.saldo += valor;
		
		}
	
	}	

