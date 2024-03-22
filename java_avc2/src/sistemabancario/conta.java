package sistemabancario;

public class conta {
	public static void main(String[] args) {
		int numero;
		String nome;
		double saldo;
		double limite;
		
		void sacar(double valor) {
			double saldoAlterado = saldo - valor;
			saldo = saldoAlterado ;
			
		}
		void depositar(double valor) {
//			this.saldo = this.saldo + valor;
			this.saldo += valor;
		}
			
		}	
		


}
