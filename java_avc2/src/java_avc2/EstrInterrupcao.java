package java_avc2;

public class EstrInterrupcao {
	public static void main (String []args) {
		String names[] = {"Bernardo","Bianca", "Breno", "Carlos"};
		
		String searchName = "Bernardo";
		
		boolean foundName = false;
		
		for (int i = 0; i < names.length; i++) {  //Start, stop, step
			if (names[i].equals(searchName)) { // equal é para comparação de variaveis 
				foundName = true;  // se for true entra no próximo bloco de comando
				break;
			}
		}
	if (foundName) { // compara o boolean do foundName, que foi setado true no bloco anterior na comparação
		System.out.println(searchName + "encontrado");
	} else {
		System.out.println(searchName + "não encontrato");
	}

}
}