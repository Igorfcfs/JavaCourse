import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A, B, C, D;
		int diferenca;
		
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("Diferenca = " + diferenca);
		
		in.close();
		
	}

}
