import java.util.Scanner;

public class DesafioAnoBissexto {
  
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o ano: ");
		int ano = entrada.nextInt();
		
		boolean anoBissexto = ano%400 == 0 ||(ano % 4 == 0 && ano % 100 != 0);
		System.out.printf("Ano Bissexto: %b%n", anoBissexto);
		
	}

}