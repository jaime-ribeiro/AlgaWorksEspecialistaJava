import java.util.Scanner;

public class FolhaPagamento {
  
  public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

  System.out.println("Insira os valores necessários para a impressão da folha de pagamento:");

  System.out.print("Nome: ");
  String nome = entrada.nextLine();

  System.out.print("Valor por Hora: ");
  double valorHora = entrada.nextDouble();

  System.out.print("Horas Trabalhadas: ");
  int horasTrabalhadas = entrada.nextInt();

  System.out.print("Valor dos Descontos: ");
  double valorDesconto = entrada.nextDouble();
  
  double valorTotal = horasTrabalhadas * valorHora;
  double valorFinal = valorTotal - valorDesconto;

  System.out.print("================================================================================");
  System.out.printf("%nFolha de pagamento: %s", nome);
  System.out.printf("%n%d horas x R$%.2f = %.2f",horasTrabalhadas, valorHora, valorTotal);
  System.out.printf("%nDescontos: R$%.2f", valorDesconto);
  System.out.printf("%nTotal devido: R$%.2f", valorFinal);
  }
}