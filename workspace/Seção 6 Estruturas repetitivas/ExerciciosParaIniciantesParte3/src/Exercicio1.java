import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int password = in.nextInt();

		while(password != 2002) {
			System.out.println("Senha Invalida");
			password = in.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		in.close();

	}

}
