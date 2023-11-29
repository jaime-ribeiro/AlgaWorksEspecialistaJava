import java.util.Scanner;

public class CurtoCircuitoOperadoresLogicos {
  
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		
		//Não vai ser incrementado pq ele vai bater na primeira condição
		//E vai retornar falso
		//boolean resultado = x == 15 && y++ == 20;
		
		//Vai incrementar
		//boolean resultado = x == 10 && y++ == 20;
		
		//Neste caso, ele vai verificar a primeira condição, ela já vai retornar
		//Verdadeiro, e aí ela não vai fazer a segunda verificação do Y
		//Assim fazendo que não ocorra a incrementação
		//boolean resultado = x == 10 || y++ == 20;
		
		//Neste caso ele vai dar false na primeira comparação e aí sim conseguirá
		//Fazer a incrementação, e a incrementação ocorrerá depois da comparação do y
		boolean resultado = x == 15 || y++ == 20;
		
		
		System.out.println(resultado);
		System.out.println(y);
	}

}