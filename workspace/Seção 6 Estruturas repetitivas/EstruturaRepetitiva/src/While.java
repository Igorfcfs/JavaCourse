import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		int sum = 0;
		while(x != 0) {
			sum += x;
			x = in.nextInt();
		}
		
		System.out.println("Sum = " + sum);
		
		in.close();

	}

}
