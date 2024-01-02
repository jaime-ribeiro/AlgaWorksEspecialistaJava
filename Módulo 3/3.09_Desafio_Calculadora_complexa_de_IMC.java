import java.util.Scanner;

public class DesafioCalculadoraIMC {
  //Lembrando que o código usando "." para separa 1.7 de altura
  //Nao vai funcionar pq a lingua quando está em Portugues Brasil precisa ser
  //colocado a ","
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Sexo(M/F):");
		char sexo = entrada.next().charAt(0);
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		//System.out.printf("Sexo %C%n", sexo);
	
		sexo = Character.toUpperCase(sexo);
		
		if(sexo == 'M'){
			System.out.println("----- IMC em homens -----");
			if(imc < 20.7) {
				System.out.println("Abaixo do peso.");
			} else if(imc < 26.5) {
				System.out.println("Peso ideal.");
			}else if(imc < 27.9) {
				System.out.println("Um pouco acima do peso.");
			}else if(imc < 31.2) {
				System.out.println("Acima do peso ideal.");
			}else { 
				System.out.println("Obeso.");
			}
		}
		
		else if(sexo == 'F'){
			System.out.println("----- IMC em mulheres -----");
			if(imc < 19.1) {
				System.out.println("Abaixo do peso.");
			} else if(imc < 25.9) {
				System.out.println("Peso ideal.");
			}else if(imc < 27.4) {
				System.out.println("Um pouco acima do peso.");
			}else if(imc < 32.4) {
				System.out.println("Acima do peso ideal.");
			}else { 
				System.out.println("Obeso.");
			}
		} 
		else {
			System.out.println("ERRO, Insira o sexo Masculino(M) ou Feminino(F)");
		}			
		
		System.out.println("Fim do programa.");
	}

}