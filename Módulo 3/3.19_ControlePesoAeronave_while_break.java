import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Peso máximo da aeronave: ");
	int pesoMaximo = entrada.nextInt();
	
	int pesoTotalPassageiros = 0;
	
	while (true){
		System.out.print("Peso do passageiro: ");
		int pesoPassageiro = entrada.nextInt();
		
		if(pesoTotalPassageiros + pesoPassageiro > pesoMaximo){
			System.out.prinln("Não pode incluir o passageiro. Peso excederia o máximo");
			//O continue passa para a próximo repetição
			//Break e continue sempre são executados no laço mais interno
			//Se tiver dois, vai passar sempre o mais interno
			continue;
		}
		
		pesoTotalPassageiros += pesoPassageiro;
		
		System.out.print("Incluir novo passageiro?");
		if(!entrada.nextBoolean()){
			break;
		}
	}
	
	System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
	System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
	System.out.printf("Situação da aeronave: %s%n", 
		pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}