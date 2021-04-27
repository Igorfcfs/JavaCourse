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
			System.out.print("Parabéns vc descobriu o código secreto!"
					+ " E então vc acaba de ganhar R$ 1.000000."
					+ " Se não acredita em mim, veja a sua conta.");
		}
		
	}

}
