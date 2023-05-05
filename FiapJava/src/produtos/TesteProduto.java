package produtos;

public class TesteProduto {
	
	public static void main(String[] args) {
		Produto p = new Produto("TV", 1000.0, 10);
		
		p.AdicionarProdutos(2);
		System.out.println(p.getQuantidade());
		
	}	
}
