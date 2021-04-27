import java.util.Locale;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5800.5;
		altura = 1.72;
		genero  = 'F';
		nome = "Maria Silva";
		
		//macete: sysout + Ctrl + Space; 
		
		System.out.println("Idade = " + idade);
		System.out.println("Salario = " + String.format("%.2f", salario));
		System.out.println("Altura = " + String.format("%.2f", altura));
		System.out.println("Genero = " + genero);
		System.out.println("Nome = " + nome);

	}

}
