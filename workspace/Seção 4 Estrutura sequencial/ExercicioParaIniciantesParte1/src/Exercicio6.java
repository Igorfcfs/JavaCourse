import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		double trianguloRetangulo, circulo, trapesio, quadrado, retangulo;
		
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		trianguloRetangulo = a * c / 2;
		circulo = Math.PI * Math.pow(c, 2.0);
		trapesio = (a + b) * c / 2.0 ;
		quadrado = Math.pow(b, 2.0);
		retangulo = a * b;
		
		System.out.printf("Area do triangulo retangulo = %.3f%n", trianguloRetangulo);
		System.out.printf("Area do circulo = %.3f%n", circulo);
		System.out.printf("Area do trapesio = %.3f%n", trapesio);
		System.out.printf("Area do quadrado = %.3f%n", quadrado);
		System.out.printf("Area do retangulo = %.3f%n", retangulo);
		
		in.close();
		
	}

}
