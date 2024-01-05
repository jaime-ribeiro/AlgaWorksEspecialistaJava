import java.util.Scanner;

public class EstruturaForIntermediario {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int num = entrada.nextInt();
    if(num < 2){
		System.out.println("O número " + num + " não é primo");
	}else{
		double quadrado = Math.sqrt(num);
		for(int i = 2; i <= quadrado; i++) {
			if(num % i == 0 ) {
				System.out.println("O número " + num + " não é primo porque é divisível por " + i);
				return;
			}
		}
		if(num > 1) {
			System.out.println("O número " + num + " é primo");
		}	
	}	
  }

}