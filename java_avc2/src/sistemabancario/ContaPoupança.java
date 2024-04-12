package sistemabancario;

public class ContaPoupança extends Conta3 {
	double correção() {
		return this.saldo * 1.01;
		
	}

}
