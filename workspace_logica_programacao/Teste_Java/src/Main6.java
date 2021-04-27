import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		M = sc.nextInt();
		
		System.out.print("Quantas colunas vai ter a matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(i = 0; i < M; i++) {
			for(j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz Digitada:");
		for(i = 0; i < M; i++) {
			for(j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
