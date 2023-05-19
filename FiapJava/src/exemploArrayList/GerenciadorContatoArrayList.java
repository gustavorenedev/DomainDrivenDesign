package exemploArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import arrayObjeto.Contato;

public class GerenciadorContatoArrayList {
	
	private ArrayList<Contato> contatos; // declarando o ArrayList
	
	public GerenciadorContatoArrayList() {
		// criando o ArrayList
		contatos = new ArrayList<Contato>();
		System.out.println("Lista criada!");
	}
	
	// caso queira retornar o nome do contato adicionado basta retornar get.nome()
	public void adicionar(Contato c) {
		contatos.add(c);
		System.out.println(c.getNome() + " foi adicionado na lista de contatos.");
	}
	
	public void atualizarContatos() {
		System.out.println("*-* Atualizando Contato *-*");
		System.out.println("===========================");

		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o índice do contato que deseja alterar: ");
		int alt = input.nextInt();
		
		if (alt < 0 || alt >= contatos.size()) {
	        System.out.println("Índice inválido.");
	        return;
	    }
	    
	    System.out.println("Digite as novas informações do contato:");
	    System.out.print("Nome: ");
	    String nome = input.next();
	    System.out.print("Telefone: ");
	    String telefone = input.next();
	    
	    // criado um novo objeto, porém ele atribui e substitui os dados para um novo
	    Contato novoContato = new Contato(nome, telefone);
	    
	    System.out.println("Contato atualizado com sucesso!");
	    System.out.println(" ");
	}
	
	
	//					qual a posição do indice
	public String remover(int i) {
		Contato c = contatos.get(i);
		contatos.remove(i);
		return c.getNome();
	}
	
	// fica salvo na memoria da lista o indice e precisamos tirar da lista
	public Contato remover(Contato c) {
		contatos.remove(c);
		return c;
	}
	
	public void mostrar() {
		// contato é uma variavel da classe Contato que recebe um array de contatos
		for (Contato contato : contatos) {
			System.out.println(contato.toString());
		}
		
//		for (int i = 0; i < contatos.size(); i++) {
//			System.out.println(contatos.get(i).toString());
//		}
	}
	
	/*
	 * TO DO
	 * - Criar um método para criar um contato
	 * - Criar um método para atualizar um contato
	 * */
	
	
}
