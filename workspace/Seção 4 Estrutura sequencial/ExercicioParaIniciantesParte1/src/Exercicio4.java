import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int numero, horas;
		double valor, salario;
		
		numero = in.nextInt();
		horas = in.nextInt();
		valor = in.nextDouble();	
		salario = valor * horas;
		
		System.out.println("NUMBER: " + numero);
		System.out.println("SALARY: " + salario);
		
		in.close();
		
	}

}
