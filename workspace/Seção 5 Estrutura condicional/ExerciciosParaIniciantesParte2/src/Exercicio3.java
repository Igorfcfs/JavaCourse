import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A, B;
		
		A = in.nextInt();
		B = in.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		in.close();

	}

}
