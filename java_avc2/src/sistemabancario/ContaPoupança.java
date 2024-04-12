package sistemabancario;

public class ContaPoupança extends Conta2 {
	double correção() {
		return this.saldo * 1.01;
		
	}

}
