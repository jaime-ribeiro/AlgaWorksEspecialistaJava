import java.util.Scanner;

public class EstruturaForIntermediario {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Insira um número: ");
	int numero = entrada.nextInt();
	int somaDePrimos = 0;
	
	for(int numeroPrimo = 1; numeroPrimo <= numero ; numeroPrimo++){
		
		if(numero%numeroPrimo==0){
			soma = numero + soma;
		}else{
			System.out.println("O número inserido é ímpar, insira um número par");
			x--;
		}
	}
	
	System.out.printf("A soma dos números inseridos é: %d%n", soma);
  }

}