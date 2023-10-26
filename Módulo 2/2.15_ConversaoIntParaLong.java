public class ConversaoIntParaLong{
	public static void main(String[] args){
		int y = 102344;
		//Neste caso onde o valor de onde vai ser atribuído é menor, não é preciso
		//especificar, usando o casting, apenas a atribuição fará a conversão automática
		
		long x = y;
		//x = (long) y;  //Esta instrução de casting é opcional
		
		System.out.println(x);
		System.out.println(y);
	}
}