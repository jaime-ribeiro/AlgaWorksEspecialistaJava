public class ExemploInt{
 public static void main(String[] args){
	//Apartir do Java 7, você pode botar um underscore "_" para melhorar a legibilidade.
	//Não altera em nada o valor, segue abaixo o exemplo:
	int populacaoUberlandia = 699_097;
	
	//int populacaoUberlandia2 = 2_147_483_648;// não compila
	
	int populacaoUberlandia2 = 2_147_483_647;
	System.out.println(populacaoUberlandia);
	System.out.println(populacaoUberlandia2);
 }
}