import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em celcius: ");
			float C = in.nextFloat();
			float F = 9.0f * C / 5.0f + 32.0f;
			System.out.printf("Equivalente em Farenheit: %.2f%n", F);
			System.out.print("Dejesa repitir(s/n)? ");
			resp = in.next().charAt(0);
		}while(resp == 's' || resp == 'S');

		in.close();
	}

}
