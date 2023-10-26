public class ConversaoDoubleParaInt{
	public static void main(String[] args){
		double largura = 100.37;
		//int tamanho = largura // não compila
		
		int tamanho = (int) largura; //isso compila
		//Vai imprimir 100 sem os .37
		System.out.println(tamanho);
	}
}