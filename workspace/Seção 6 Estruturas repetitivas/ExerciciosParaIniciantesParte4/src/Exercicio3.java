import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float A, B, C, mediaPond;
		
		for(int i = 1; i <= N; i++) {
			A = sc.nextFloat();
			B = sc.nextFloat();
			C = sc.nextFloat();
			mediaPond = (2 * A + 3 * B + 5 * C) / 10; 
			System.out.printf("%.1f%n", mediaPond);
		}
		
		
		sc.close();
	}

}
