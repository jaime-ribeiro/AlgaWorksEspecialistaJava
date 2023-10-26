public class ExemploBoolean {
	public static void main (String[] args){
		//Não pode trocar o "true" por 1
		//Ele vai considerar o 1 como int
		boolean compraAprovada = true;
		boolean clienteBloqueado = false;
		
		System.out.println(compraAprovada);
		System.out.println(clienteBloqueado);
		
		int quantidadeEstoque = 10;
		int quantidadePedidoCompra = 15;
		
		boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
		System.out.println("Estoque disponível: " + estoqueSuficiente);
	}
}