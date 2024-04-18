package sistemabancario;

public class Caixa extends Funcionario2 {
	public boolean verificaSenha(String senha) {
		// método que verifica senha
		// implementação diferente da classe gerente
		return false;
	}

	@Override
	double Bonus() {
		// TODO Auto-generated method stub
		return 0;
	}

}
