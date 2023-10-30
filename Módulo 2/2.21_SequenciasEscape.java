public class FormatandoComPrintf {
  public static void main(String[] args){
    String nome1 = "Thiago";

    // Printar sem concatenação, ele permite usar o %s, para utilizar o nome de variáveis que são strings
    // %n serve para realizar quebra de linhas
    System.out.printf("Olá, %s%n", nome1);

    int quantidade = 48;
    //Para números inteiros se usa %d
    System.out.printf("A quantidade é: %d itens%n", quantidade);

    //Para pontos flutuantes, se usa o %f
    //Por padrão ele adiciona 6 casas decimais, para colocar somente 2 casas decimais, precisa colocar .2 antes do f, ficando assim: "%.2f"
    double peso = 938.22;
    System.out.printf("Peso: %.2f%n",peso);
    
  } 
}