import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		/* Digitar dados em linhas diferentes
		String nome;
		int x;
		double y;
		char z;
		
		nome = in.next();
		System.out.println("Voce digitou: " + nome);
		x = in.nextInt();
		System.out.println("Voce digitou: " + x);
		y = in.nextDouble();
		System.out.println("Vece digitou: " + y);
		z = in.next().charAt(0);
		System.out.println("Vece digitou: " + z);*/
		
		/* Digitar dados na mesma linha
		String x;
		int y;
		double z;
		
		x = in.next();
		y = in.nextInt();
		z = in.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
		
		/* Digitar ate o usuario apertar o enter
		String s1, s2, s3;
		
		s1 = in.nextLine();
		s2 = in.nextLine();
		s3 = in.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		//Quebra de linha pendente, e resolucao
		int x;
		String s1, s2, s3;
		
		x = in.nextInt();
		in.nextLine();	//resolucao
		s1 = in.nextLine();
		s2 = in.nextLine();
		s3 = in.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		in.close();
	}

}
