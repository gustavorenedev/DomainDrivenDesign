package arrayList;

public class ItemPedido {
	// relação 
	private Produto produto;
	private int quantidade;
	
	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorSubTotal() {
		return produto.getPreco() * quantidade;
	}
	
}
