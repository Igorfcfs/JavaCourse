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
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.0));
		
		/*Option 2
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}	
		};*/
		
		/*Option 3
		Comparator<Product> comp = (Product p1, Product p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		/*Option 4
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		/*Option 5
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/
		
		/*Option 1
		list.sort(new MyComparator());*/
		
		/*Option 2, 3, 4 and 5
		list.sort(comp);*/
		
		//Option 6
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}	
	}
}
