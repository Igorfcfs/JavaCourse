import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		/*int x = 32;
		double y = 10.35784;
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(x);
		System.out.println(y);
		System.out.printf("Valor de y: " + "%.2f%n", y);
		System.out.printf("Valor de y: " + "%.4f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de y: " + "%.4f%n", y);
		System.out.printf("Resultado = " + x + " Metros%n");
		System.out.printf("Resultado = %.2f Metros%n", y);*/
		
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
	}
}
