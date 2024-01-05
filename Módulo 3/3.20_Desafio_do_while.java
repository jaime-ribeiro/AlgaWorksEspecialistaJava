import java.util.Scanner;

public class EstruturaDoWhile {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	boolean continuarAplicacao = true;
    int somaPar = 0;
    int somaImpar= 0;

    do{
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
        if(num % 2 == 0 ){
			somaPar += num;
		} else{
			somaImpar += num;
		}
		System.out.println("Deseja continuar a aplicação?");
		continuarAplicacao = entrada.nextBoolean();
    }while (continuarAplicacao);

    System.out.println("A soma dos números pares inseridos: " + somaPar);
	System.out.println("A soma dos números ímpares inseridos: " + somaImpar);
  }

}