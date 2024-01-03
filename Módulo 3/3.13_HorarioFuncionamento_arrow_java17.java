import java.util.Scanner;

public class AvaliacaoAtendimento {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc):");
		String diaSemana = entrada.nextLine();
		
		
		System.out.print("Mês: ");
		int mes = entrada.nextInt();
		//String horarioFuncionamento;
		/*
		switch (diaSemana) {
			case "seg" -> horarioFuncionamento = "Fechado";
			case "ter", "qua","qui","sex" -> horarioFuncionamento = "8:00 às 18:00";
			case "sab", "dom" -> {
				horarioFuncionamento = "8:00 às 12:00";
			}
			default -> horarioFuncionamento = "Dia Inválido";
			//Caso precise de mais linhas de código, pode abrir e fechar chaves
			// Como é visto em case "sab", "dom" ->
		}
		*/
		
		//Pode ser feito tbm desta forma, atribuindo diretamente na variável
		//Switch expression, inclusive ele pode ser usado dentro de um System.out.printf	
		// por existir uma lógica na segunda, precisa usar o yeld para que ele entenda o que vai executar
		String horarioFuncionamento = switch (diaSemana) {
			case "seg" -> {
				if(mes == 12) {
					yield "8:00 às 16:00";
				}
				yield "Fechado";
			}
			case "ter", "qua","qui","sex" ->  "8:00 às 18:00";
			case "sab", "dom" -> "8:00 às 12:00";
			default -> "Dia Inválido";
			//O default é obrigatório para switch expression
		};
		
		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
	}
}