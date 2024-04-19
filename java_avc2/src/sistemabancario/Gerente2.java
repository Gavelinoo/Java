package sistemabancario;


public class Gerente2 extends Funcionario2 {
	int senha;
	
//	public double Bonus() {
//		return super.Bonus() + 5000; // bonus vai ser somente para a classe de gerente, e é polimorfismo de sobrescrita
//	}
	
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
		
	}

@Override
void verificaSenha() {
	// TODO Auto-generated method stub
	
}

@Override
double Bonus() {
	// TODO Auto-generated method stub
	return 0;
}

}
