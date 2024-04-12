package sistemabancario;

public class TesteControleSalarial {
	public static void main(String [] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		controle.setTotalSalarios(f1);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Funcionario f2 = new Funcionario();  //instaciou funcionario
		f2.setSalario(3000);  // definiu salario
		controle.setTotalSalarios(f2); // 
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Funcionario f3 = new Gerente2();  //instaciou funcionario
		f3.setSalario(4000);  // definiu salario
		controle.setTotalSalarios(f3); // 
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
				
	}

}
