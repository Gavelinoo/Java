package java_avc2;

public class Casting {
	public static void main(String[] args) {
		double d = 10.50;
		
		int i = (int) d;
		System.out.println(i);
		
		long n = 1000000;
		System.out.println(n);
		
		long m = 10000000000L; //tem que botar um L no final pra não reconhecer como 
		System.out.println(m);
		float f1 = 500;
		System.out.println(f1);
		
		long k = 10000000000000L;
		int i2 = (int) k;
		System.out.println(i2); // não pode fazer esse caso, o numero fica erado
	}

}
