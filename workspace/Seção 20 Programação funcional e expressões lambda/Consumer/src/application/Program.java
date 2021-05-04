package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*Option 1
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);*/
		
		/*Option 2
		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);*/
		
		/*Option 3
		list.forEach(Product::nonStaticPriceUpdate);
		list.forEach(System.out::println);*/
		
		/*Option 4
		double factor = 1.1;
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		list.forEach(cons);
		list.forEach(System.out::println);*/
		
		//Option 5
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
		
	}
}
