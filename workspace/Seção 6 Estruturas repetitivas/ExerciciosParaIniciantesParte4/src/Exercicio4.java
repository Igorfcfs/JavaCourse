import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int numerador = sc.nextInt(), denominador = sc.nextInt();
			float divisao = (float)numerador / denominador;
			if(denominador == 0) {
				System.out.println("Divisao Impossivel!");
			} else {
				System.out.println(divisao);
			}
			
		}
		
		sc.close();

	}

}
