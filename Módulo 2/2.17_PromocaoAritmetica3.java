public class PromocaoAritmetica3{
	public static void main(String[] args){
		int x = 3;
		//caso altere para float - float y = 2, no fim ele vai fazer 1.5
		int y = 2;
		//3 divido por 2 com os dois sendo int vai dar 1
		//outra forma de solucionar é fazendo o casting em um dos valores
		float z = x / (float)y; 
		
		System.out.println(z);
	}
}