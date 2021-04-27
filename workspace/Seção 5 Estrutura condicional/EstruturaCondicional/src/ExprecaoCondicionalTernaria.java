
public class ExprecaoCondicionalTernaria {

	public static void main(String[] args) {

		/* sem exprecao condicional ternaria
		double preco = 34.5;
		double desconto;

		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}*/

		//com exprecao condicional ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}

}
