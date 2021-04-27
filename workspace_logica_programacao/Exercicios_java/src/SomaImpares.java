import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, i, troca, soma;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for(i = x+1; i < y; i++) {	
			if(i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("Soma dos Impares = " + soma);
		
		sc.close();
	}

}
