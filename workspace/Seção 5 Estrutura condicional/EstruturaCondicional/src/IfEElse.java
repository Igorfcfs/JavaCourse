import java.util.Scanner;

public class IfEElse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int hora;

		System.out.print("Que horas são: ");
		hora = in.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}

		in.close();

	}

}
