import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int value = in.nextInt(), alcool = 0, gasolina = 0, diesel = 0;
		
		while(value != 4) {
			switch(value) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;			
			}
			
			value = in.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO:");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		in.close();
		
	}

}
