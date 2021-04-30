package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//hashCode and Equals
		/*String a = "Maria";
		String b = "Alex";
		
		//equals
		System.out.println("Equals: " + a.equals(b));
		
		//hashCode
		System.out.println("Hash Codes:");
		System.out.println("a: " + a.hashCode());*/
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println("c1.hashCode(): " + c1.hashCode());
		System.out.println("c2.hashCode(): " + c2.hashCode());
		System.out.println("c1.equals(c2): " + c1.equals(c2));//content
		
		System.out.print("c1 == c2: ");
		System.out.println(c1 == c2);//memory difference
		
		System.out.print("s1 == s2: ");
		System.out.println(s1 == s2);//memory difference(Special treatment)
		
		System.out.print("s3 == s4: ");
		System.out.println(s3 == s4);//memory difference	
	}
}
