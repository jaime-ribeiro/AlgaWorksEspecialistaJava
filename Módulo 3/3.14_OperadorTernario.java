import java.util.Scanner;

public class CalculadoraImpostos {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in); 
		
		char tipoNotaFiscal = 'S';
		double totalFaturado = 1200.30;
		
		/*
		double valorImposto;
		
		if(tipoNotaFiscal == 'S'){
			valorImposto = totalFaturado * 0.16;
		} else {
			valorImposto = totalFaturado * 0.35;
		}
		*/
		
		 // double valorImposto = tipoNotaFiscal == 'S'
	
	
	//double taxaImposto = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
	
	double taxaImposto = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
	double valorImposto = totalFaturado * taxaImposto;
	
	System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
	System.out.printf("Valor dos impostos: R$%.2f%n", valorImposto);

	}

}