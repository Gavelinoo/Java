package java_avc2;

public class Estrutura_de_decisao {
	public static void main (String[] args) {
		int grade = 58;
		if(grade >= 90) {
			System.out.println("Ótimo");
		} else if ((grade<90) && (grade >=70)) {
			System.out.println("BOm");
		} else if ((grade <70) && (grade >=50)) {
			System.out.println("Bom");
		} else {
			System.out.println("Insuficiente");
		}
	}

}
