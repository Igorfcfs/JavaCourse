import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double raio = in.nextDouble();
		double area = Math.PI * Math.pow(raio, 2.0);
		
		System.out.printf("Area = %.4f", area);
		
		in.close();
		
	}

}
