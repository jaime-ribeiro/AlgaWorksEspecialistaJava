public class PromocaoAritmetica2{
	public static void main(String[] args){
		long x = 10;
		//Precisa do f por que por padrão ele considera que o valor é double
		float y = 9.34f;
		
		//long z = x * y; //Não compila
		//Apesar de long ter 64 bits e float ter 32bits, o ponto flutuante tem prioridade
		// nas atribuições.
		float z = x * y; 
		
		System.out.println(z);
	}
}