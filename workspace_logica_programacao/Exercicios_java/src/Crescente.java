import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N, i;
		
		System.out.println("Digite dois numeros: ");
		M = sc.nextInt();
		N = sc.nextInt();
		
		if (M > N) {
			System.out.println("Decrecente");
		}else {
			System.out.println("Crescente");
		}
		
		while (M != N){
			System.out.println("Digite outros dois numeros: ");
			M = sc.nextInt();
			N = sc.nextInt();
			
			if (M > N) {
				System.out.println("Decrecente");
			}else if (M < N){
				System.out.println("Crescente");
			}
		}
		
		
		sc.close();
	}

}
