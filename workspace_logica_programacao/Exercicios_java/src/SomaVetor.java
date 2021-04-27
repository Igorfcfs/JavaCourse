import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		float soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		float[] vet = new float[N];
		
		for(i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextFloat();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		soma = 0;
		for(i = 0; i < N; i++) {
			System.out.print(vet[i] + " ");
			soma = soma + vet[i];
		}
		
		System.out.println();
		System.out.println("Soma = " + String.format("%.2f", soma));
		
		media = soma / N;
		
		System.out.println("Media = " + String.format("%.2f", media));
		
		sc.close();
	}

}
