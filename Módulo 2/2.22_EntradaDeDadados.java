import java.util.Scanner;

public class EntradaDeDados {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //Espera receber um inteiro
    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    //Espera receber um double
    //Para inserir o valor, vai precisar ser com a vírgula porque a lingua que foi selecionada está em português
    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    //A entrada de linha não funcionará normalmente, precisa desta outra entrada
    //Isto ocorre porque a quebra de linha anterior é consumida, esta quebra de linha aparece sempre que o usuário aperta Enter para confirmar a entrada de texto, ou seja, no nextInt() e no nextDouble(), fazendo que o nome que recebe o entrada.nextLine() fique em branco, porque consome os ENTER's das confirmações dos valores mencionados acima, aí precisa desta "Gambiarra" para funcionar, porque ela consome os ENTER's e aí abaixo ele vai consumir somente os valores digitados.
    //Mas caso o bloco de inserção do Nome "vá lá pra cima", ou seja, para cima do next.int() sendo o primeiro a receber o valor,  
    entrada.nextLine();

    System.out.printf("Nome: ");
    String nome = entrada.nextLine();

    double imc = peso / (altura * altura);
    System.out.println(imc);

    System.out.printf("IMC de %s: %.2f%n", nome, imc);
  }

}