package sistemabancario;

public class Funcionario { // essa classe so serve como molde, so tem os atributos e por isso não tem o mais
	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	void bonificacao(double bonus) {
		salario = salario + bonus;
		
	}

}
