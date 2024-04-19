package sistemabancario;

public abstract class Funcionario2 { // essa classe so serve como molde, so tem os atributos e por isso não tem o mais
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected String dataAdmissao;
	protected double salario;
	protected String status;
	
	abstract double Bonus(); // o abstract faz todo mundo que herdar a classe ter que implementar esse metódo, overwrite explicito
	
//	public double Bonus() {
//		return this.salario* 0.05;
//	
//	
////		
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}