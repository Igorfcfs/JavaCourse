package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*Option 1
		list.removeIf(p -> p.getPrice() >= 100.00);*/
		
		/*Option 2
		list.removeIf(new ProductPredicate());*/
		
		/*Option 3
		list.removeIf(Product::staticProductPredicate);*/
		
		/*Option 4
		list.removeIf(Product::nonStaticProductPredicate);*/
		
		/*Option 5
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);*/
		
		//Option 6
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
