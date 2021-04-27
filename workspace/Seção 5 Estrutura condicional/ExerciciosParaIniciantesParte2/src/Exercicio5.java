import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int cod = in.nextInt();
		int value = in.nextInt();
		float price = 0.00f, total;

		switch (cod) {
		case 1:
			price = 4.00f;
			break;

		case 2:
			price = 4.50f;
			break;

		case 3:
			price = 5.00f;
			break;
		case 4:
			price = 2.00f;
			break;
		case 5:
			price = 1.50f;
			break;
		}
		
		total = price * value;
		
		System.out.printf("Total = %.2f", total);

		in.close();
		
	}

}
