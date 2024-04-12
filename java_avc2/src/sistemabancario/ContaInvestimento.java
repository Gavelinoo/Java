package sistemabancario;

public class ContaInvestimento extends Conta2 {
	double correcao () {
		return this.saldo * 1.02;
		
	}

}
