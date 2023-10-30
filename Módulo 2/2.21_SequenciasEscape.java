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
    
    // O número 10 antes do "." indica o tamanho de caracteres que deve ter, contando a precisão e o "." do valor,  exemplo.: %10.2f%n
    
    //Caso tenha espaços a menos, ele colocará espaços em branco " " para preencher, por exemplo o peso, ficará: ____938.22, entretanto ao invés de underline, serão espaços em branco.

    double peso = 938.22;
    System.out.printf("Peso: %.2f%n",peso);
    //Dependendo das configurações de linguagem, o separador decimal pode estar "," ao invés de ".", em português aparece "," e inglês aparece ".".
  } 
}