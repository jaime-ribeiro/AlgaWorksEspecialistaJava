public class ExemploString {

  public static void main(String[] args) {
    int x = 10;
	int y = 5;
	int z = x + y;
	//Vai mostrar que o resultado é 105
    System.out.println("Resultado: " + x + y);
	//Vai mostrar que o resultado é 15, pq ele vai verificar que são dois ints
	// vai realizar a conta, e após isso ele vai tentar somar o texto "texto" + x
	// Por não poder somar texto com int ele vai concatenar 
	
	System.out.println( x + y + " foi o resultado." );
	
	//Aqui vai realizara soma normalmente pq ele vai realizar a soma dos int's primeiro
	System.out.println("Resultado: " + (x + y));
	
	//O tipo String não é tipo primitivo, é uma classe
	String nome = "Maria";
	int idade = 30;
	
	System.out.println(nome + " Tem " + idade + " anos");
  }

}