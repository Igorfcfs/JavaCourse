import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x;
		int y;
		int result;
		
		x = in.nextInt();
		y = in.nextInt();
		result = x + y;
		
		System.out.println("Soma = " + result);
		
		in.close();
		
	}

}
