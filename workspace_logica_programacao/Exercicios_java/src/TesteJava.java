import java.util.Scanner;

public class TesteJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean b = false;
		
		for (int i = x; i <= y; i++) {
			
			if (val == 007) {
				b = true;
			}
			else {
				b = false;
			}
			
			if (i == 1) {
				System.out.println("espere...");
			}
			
			
		}
		
		if (b == true) {
			System.out.print("Parab�ns vc descobriu o c�digo secreto!"
					+ " E ent�o vc acaba de ganhar R$ 1.000000."
					+ " Se n�o acredita em mim, veja a sua conta.");
		}
		
	}

}
