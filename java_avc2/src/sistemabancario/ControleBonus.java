package sistemabancario;

public class ControleBonus { 
	private double totalBonus = 0;
	public void setTotalBonus(Funcionario funcionario) { // definiu os metodos com a classe mais genérica e tempo de execução.
		this.totalBonus = this.totalBonus + funcionario.Bonus();
		
	}
	
	public double getTotalBonus() {
		return totalBonus;
		
	}
}
