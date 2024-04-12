package sistemabancario;

// Exemplo de classe de polimorfismo
public class TestaHerança2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		double salFuncionario = f1.getSalario();
		System.out.println("O salário do funcionario é: "+salFuncionario);
		System.out.println("O bonus do funcionario é: "+f1.Bonus());
		
		Gerente2 g1 = new Gerente2(); //polimorfismo de sobrescrita
		g1.setSalario(2000);
		System.out.println("O salario do gerente é: "+g1.getSalario());
		System.out.println("O bonus de gerente é : "+g1.Bonus()); // usa o polimorfismo de sobreescrita, usando o metódo da classe gerente
	}

}
