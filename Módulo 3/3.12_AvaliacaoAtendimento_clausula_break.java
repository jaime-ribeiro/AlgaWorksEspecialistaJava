import java.util.Scanner;

public class AvaliacaoAtendimento {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Avalie o nosso atendimento (1 a 5): ");
		int nota = entrada.nextInt();
		
		String descricaoNota;
		
		//Switch não funciona com long
		//Precisa colocar o break se não todos os outros casos serão executados em cadeia
		//, mesmo não entrando na condição
		
		switch (nota) {
			case 1: 
				descricaoNota = "Muito ruim";
				break;
			case 2: 
				descricaoNota = "Ruim";	
				break;
			case 3: 
				descricaoNota = "Razoável";
				break;
			case 4: 
				descricaoNota = "Muito bom";
				break;
			case 5: 
				descricaoNota = "Excelente";
				break;
			default:
				descricaoNota = "Opção inválida";
				break;
		}
		
		System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
	}
}