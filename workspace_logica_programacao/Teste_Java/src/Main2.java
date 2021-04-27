import java.util.Locale; 

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		/*System.out.println("Bom Dia");
		System.out.print("Boa Noite");*/
		
		/*int x, y;
		
		x = 10;
		y = 20;
		
		System.out.println(x);
		System.out.println(y);*/
		
		/*double x;
		
		x = 2.3456;
		
		System.out.println(String.format("%.2f", x));*/
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 32;
		salario = 4560.9;
		nome = "Maria Silva";
		sexo = 'F';
		
		System.out.println("A funcionaria " + nome +
		", sexo " + sexo + ", ganha " +
		String.format("%.2f", salario) + " e tem " +
		idade + " anos"); 
	}

}
