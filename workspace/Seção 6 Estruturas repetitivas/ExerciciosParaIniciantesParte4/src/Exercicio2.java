import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), in = 0, out = 0;
		
		for(int i = 1; i <= x; i++) {
			int values = sc.nextInt();
			if(values >= 0 && values <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			
		}
		
		System.out.println("In: " + in);
		System.out.println("Out: " + out);
		
		sc.close();

	}

}
