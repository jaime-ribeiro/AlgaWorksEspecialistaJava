public class OlaMergulhador {
	
	public static void main(String[] args) {
		int minhaIdade = 40;
		int suaIdade = 40;
		
		//Adição
		int totalIdades = minhaIdade + suaIdade + 100;
		System.out.println("Soma das idades:" + totalIdades);
		
		//Subtração
		int diferencaIdades = minhaIdade - suaIdade;
		System.out.println("Diferença das idades:" + diferencaIdades);
		
		//Multiplicação
		int dobraIdade = 2 * suaIdade;
		System.out.println("Dobro da sua idade:" + dobraIdade);
		
		//Divisão
		int metadeIdade = 2 / suaIdade;
		System.out.println("Metade da sua idade:" + metadeIdade);
		
		//Resto Divisão
		int restoDivisao = 7 % 3;
		System.out.println("Resto da divisão:" + restoDivisao);
	}
	
}