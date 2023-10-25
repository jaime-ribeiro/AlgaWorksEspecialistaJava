public class AbreviandoOperadorAritmetico {
	
	public static void main(String[] args) {
		int quantidadeProdutos = 10;
		
		//Isso aqui:
		//quantidadeProdutos = quantidadeProdutos + 3;
		
		//É o mesmo que isso aqui:
		//quantidadeProdutos += 3;  vai resultar em 13
		
		//quantidadeProdutos -= 3; vai resultar em 7
		
		//quantidadeProdutos *= 3; vai resultar em 30
		
		//quantidadeProdutos /= 2; vai resultar em 5
		
		quantidadeProdutos %= 4; // vai resultar em 2
		
		System.out.println(quantidadeProdutos);
	}
	
}