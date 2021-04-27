import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, negativos;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		negativos = 0;
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] < 0) {
					negativos = negativos + 1;
				}
			}
		}
		
		System.out.println("Diagonal Principal:");
		for(i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Quantidade de Negativos = " + negativos);
		
		sc.close();
	}

}
