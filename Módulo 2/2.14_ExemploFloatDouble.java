public class ExemploFloatDouble {
	public static void main(String[] args){
		double peso = 84.9d; // O "d" é opcional e pode ser maiúsculo ou minúsculo
		System.out.println(peso);
		
		
		//float taxa = 1_294.93; //Não compila	
		//Ele precisa do f, porque o Java por padrão considera que valores com "." são double ao invés de float
		float taxa = 1_294.93f;
		System.out.println(taxa);
		//Foi informado que valores financeiros que precisam de bastante precisão, não são recomendados os usos de float e double.
		//O tipo usado normalmente é o BigDecimal
	}
}