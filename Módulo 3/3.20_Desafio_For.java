import java.util.Scanner;

public class EstruturaFor {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int soma = 0;
	
	for(int x = 1; x <= 10 ; x++){
		System.out.printf("Insira o %dº número: %n", x);
		int numero = entrada.nextInt();
		if(numero%2==0){
			soma = numero + soma;
		}else{
			System.out.println("O número inserido é ímpar, insira um número par");
			x--;
		}
	}
	
	System.out.printf("A soma dos números inseridos é: %d%n", soma);
  }

}