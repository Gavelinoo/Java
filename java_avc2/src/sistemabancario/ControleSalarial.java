package sistemabancario;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	public void setTotalSalarios(Funcionario funcionario) {
		this.totalSalarios = this.totalSalarios + funcionario.getSalario();
		
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
				
	}
	
}
