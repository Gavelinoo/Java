package sistemabancario;

public class Conta {
	int numero;
	public String nome;
	public double saldo;
	double limite;
		
//		void sacar(double valor) {
//			double saldoAlterado = saldo - valor;
//			saldo = saldoAlterado ;
//		}
		
	boolean sacar (double valor) {
		if (valor > this.saldo + this.limite) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
		
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
//		this.saldo += valor;
		
		}
	
	}	
