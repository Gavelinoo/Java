package java_avc2;

public class BreakRotulado {
	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		int searchNum = 5;

		boolean foundNum = false;

		searchLabel: for (int i = 0; i < numbers.length; i++) { // break rotulado via dois pontos
			for (int j = 0; j < numbers[i].length; j++) {
				if(searchNum == numbers[i][j]) {
					foundNum = true;
					break searchLabel;	// normalmente o break sairia do for, mas ele sai do break nomeado				
				}
			}
		}
		if (foundNum) {
			System.out.println(searchNum + " foi encontrado!");
		} else {
			System.out.println(searchNum + " não foi encontrado!");
		}

	}

}
