public class CalculadoraIdadeMedia {

  public static void main(String[] args) {
    int idade1 = 30;
    int idade2 = 40;
    int idade3 = 60;
	//Funciona atribuindo o casting ao dividendo
    //float idadeMedia = (idade1 + idade2 + (float) idade3) / 3;
	//Achei essa segunda solução mais limpa, atribuindo o float ao divisor, apenas usando o "f"
	float idadeMedia = (idade1 + idade2 + idade3) / 3f;

    System.out.println("Idade média: " + idadeMedia);
  }

}