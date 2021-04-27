import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int numero1, numero2;
		double valor1, valor2, resultado1, resultado2, pagar;
		
		in.nextInt();
		numero1 = in.nextInt();
		valor1 = in.nextDouble();
		
		in.nextInt();
		numero2 = in.nextInt();
		valor2 = in.nextDouble();
		
		resultado1 = valor1 * numero1;
		resultado2 = valor2 * numero2; 
		
		pagar = resultado1 + resultado2;
		
		System.out.printf("Valor a pagar: %.2f", pagar);
		
		in.close();
		
	}

}
