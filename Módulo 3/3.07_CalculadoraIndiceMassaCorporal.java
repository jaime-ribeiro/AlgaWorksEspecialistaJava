import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
  //Lembrando que o código usando "." para separa 1.7 de altura
  //Nao vai funcionar pq a lingua quando está em Portugues Brasil precisa ser
  //colocado a ","
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso ideal.");
		}
		
		if(imc >= 18.5 && imc < 25) {
			System.out.println("Peso ideal.");
		}
		if(imc >= 25 && imc < 30) {
			System.out.println("Acima do peso.");
		}
		if(imc >= 30 && imc < 35) {
			System.out.println("Obesidade de grau I.");
		}
		if(imc >= 35 && imc < 40) { 
			System.out.println("Obesidade de grau II.");
		}
		if(imc >= 40) {
			System.out.println("Obesidade de grau III.");
		}
		
		System.out.println("Fim do programa.");
	}

}