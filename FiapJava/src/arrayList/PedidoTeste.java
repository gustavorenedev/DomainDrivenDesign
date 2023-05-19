package arrayList;

public class PedidoTeste {
	public static void main(String[] args) {
		
		// Criando objetos de produtos
		Produto p1 = new Produto(1, "Camiseta", 29.99);
		Produto p2 = new Produto(2, "Jaqueta", 99.99);

		ItemPedido item1 = new ItemPedido(p1, 2);
		ItemPedido item2 = new ItemPedido(p2, 1);
		
		Pedido pedido = new Pedido(123);
		
		pedido.adicionarItem(item1);
		pedido.adicionarItem(item2);
		
		System.out.println("Número do pedido: " + pedido.getNumero());
		System.out.println("Itens de pedido: ");
		for(ItemPedido item: pedido.getItens()) {
			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Subtotal: " + item.valorSubTotal());
		}
		System.out.println("Valor total do pedido: R$ " + pedido.getValorTotal());

	}
}
