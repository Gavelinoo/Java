package sistemabancario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Clayton";
		f1.status = "Ativo";
		f1.salario = 500.0;
		System.out.println("Salario: "+f1.salario);
		f1.bonificacao(100);
		System.out.println("Salario com bonus: "+f1.salario);
	}

}
