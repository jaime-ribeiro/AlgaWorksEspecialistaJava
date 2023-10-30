public class SequenciasEscape{
  public static void main(String[] args){
    //Sequencias de escape são combinações de caracteres inciadas com "\" para representar caracteres de controle como aspas "" quebras de linha, etc...
    System.out.println("Oi \"Maria\"");
    
    //Quebra de linha
    System.out.println("Seu nome: \nJoão");

    //Para printar a "\" que é um caracter de escape é só utilizar ele duas vezes que ele vai aparecer uma vez
    System.out.println("C:\\Windows");
  }
}