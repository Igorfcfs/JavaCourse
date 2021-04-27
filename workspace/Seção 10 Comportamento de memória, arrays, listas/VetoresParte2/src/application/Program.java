package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length/*n*/; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i <vect.length /*n*/; i++) {
			sum += vect[i].getPrice();
		}
		
		double avarage = sum / vect.length/*n*/;
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avarage);
		
		sc.close();

	}

}
