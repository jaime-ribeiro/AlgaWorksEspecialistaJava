public class ExemploLong{
	public static void main(String[] args) {
		long populacaoUberlandia = 699_097;
		/*O número literal não funciona por ser muito grande
		  ou seja, ele considera como int o número e não em si a variável
		  Uma das formas de fazer funcionar para colocar valores muito grandes
		  é utilizando o "L" no final de cada valor
		*/
		
		long populacaoUberlandia2 = 2_147_483_648L;
		//System.out.println(2_147_483_648); //Não compila
		System.out.println(2_147_483_648L);
		System.out.println(populacaoUberlandia);
		System.out.println(populacaoUberlandia2);
	}
	
}