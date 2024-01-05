import java.util.Scanner;

public class EstruturaWhile {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int soma = 0;
	
	while(soma < 100 ){
		System.out.println("Insira o número que será somado:");
		int num = entrada.nextInt();	
		soma = soma + num;
	}
	System.out.printf("A soma dos números inseridos é: %d%n", soma);
  }

}