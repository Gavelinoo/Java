package sistemabancario;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle= new ControleBonus();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		controle.setTotalBonus(f1);
		System.out.println("Bonus pagos até agora: "+ controle.getTotalBonus());
		
		Gerente2 g1 = new Gerente2();
		g1.setSalario(3000);
		controle.setTotalBonus(g1);
		System.out.println("Bonus pagos até agora: "+ controle.getTotalBonus());
	}

}
