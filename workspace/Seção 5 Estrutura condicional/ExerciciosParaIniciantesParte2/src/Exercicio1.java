import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		if(x > 0) {
			System.out.println("POSITIVO");
		}
		else if(x < 0){
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NEUTRO");
		}
		
		in.close();

	}

}
