import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(), sum = 0;
		
		for(int i = 0; i < N; /*i = i + 1 ou i += 1 ou*/ i++) {
			int x = in.nextInt();
			
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		System.out.println();
		
		//Contagem regressiva

		System.out.println("Contagem regressiva:");
		for(int i = 4; i >= N; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		in.close();
	}

}
