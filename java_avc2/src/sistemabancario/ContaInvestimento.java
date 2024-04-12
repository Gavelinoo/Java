package sistemabancario;

public class ContaInvestimento extends Conta3 {
	double correcao () {
		return this.saldo * 1.02;
		
	}

}
