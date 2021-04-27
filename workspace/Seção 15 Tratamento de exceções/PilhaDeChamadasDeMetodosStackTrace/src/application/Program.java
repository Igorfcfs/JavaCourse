package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Method1();
		System.out.println("End of program");
		
	}

	public static void Method1() {
		
		System.out.println("***MATHOD1 START***");
		Method2();
		System.out.println("***MATHOD1 END***");
		
	}

	public static void Method2() {

		System.out.println("***MATHOD2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}

		sc.close();

		System.out.println("***MATHOD2 END***");

	}

}
