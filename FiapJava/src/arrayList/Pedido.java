package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numero;
	// instanciar no construtor
	private List<ItemPedido> itens;
	
	public Pedido(int numero) {
		this.numero = numero;
		this.itens = new ArrayList<ItemPedido>();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for(ItemPedido item: itens) {
			valorTotal += item.valorSubTotal();
		}
		return valorTotal;
	}
	
	// método que devolve a lista 
	public List<ItemPedido> getItens(){
		return itens;
	}
}
