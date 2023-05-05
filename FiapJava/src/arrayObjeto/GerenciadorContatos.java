package arrayObjeto;

import java.util.Scanner;

public class GerenciadorContatos {
	
	// criando um vetor de inteiros
	//int[] vetor;
	
	// criando um vetor de contatos(objeto)
	private Contato[] contatos; //lista de contatos
	private Scanner input; //declarando um Scanner
	
	// criando um objeto
	public GerenciadorContatos(int t) {
		System.out.println("Lista criada: " + t + " elementos");
		System.out.println("=================================");
		contatos = new Contato[t];
	}
	
	public Contato criarContato() {
		System.out.println("*-* Criando Contato *-*");
		System.out.println("=======================");
		input = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Telefone: ");
		String telefone = input.next();
		
		// instanciando o objeto Contato
		Contato contato = new Contato(nome, telefone);
	    System.out.println("Contato atualizado com sucesso!");
	    System.out.println(" ");
		return contato;
	}
	
	public void adicionarContatos() {
		System.out.println("*-* Adicionando Contatos na lista *-*");
		System.out.println("=====================================");
		
		for (int i = 0; i < contatos.length; i++) {
			
			// adicionando o Contato no array contatos
			contatos[i] = criarContato();
		}
		
	}
	
	public void atualizarContatos() {
		System.out.println("*-* Atualizando Contato *-*");
		System.out.println("===========================");

		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o índice do contato que deseja alterar: ");
		int alt = input.nextInt();
		
		if (alt < 0 || alt >= contatos.length) {
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
	    contatos[alt] = novoContato;
	    
	    System.out.println("Contato atualizado com sucesso!");
	    System.out.println(" ");
	}
	
	public void deletarContato() {
		System.out.println("*-* Deletando Contato *-*");
		System.out.println("===========================");

		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o índice do contato que deseja alterar: ");
		int alt = input.nextInt();
		
		if (alt < 0 || alt >= contatos.length) {
	        System.out.println("Índice inválido.");
	        return;
	    }
		
		for (int i = alt; i < contatos.length - 1; i++) {
	        contatos[i] = contatos[i + 1];
	    }

	    // Ajusta o tamanho do array para remover o último elemento
	    Contato[] novoArray = new Contato[contatos.length - 1];
	    System.arraycopy(contatos, 0, novoArray, 0, novoArray.length);
	    contatos = novoArray;

	    System.out.println("Contato excluído com sucesso!");
	}
	
	public void mostrarContatos() {
		System.out.println("*-* Mostrando os Contatos da lista *-*");
		System.out.println("======================================");
		
		// pra cada elemento da lista imprimir nome e telefone
		for (int i=0; i < contatos.length; i++) {
			// dentro do i pegar o nome
//			System.out.println("Nome: " + contatos[i].getNome());
//			System.out.println("Telefone: " + contatos[i].getTelefone());
//			System.out.println("=================================");
			
			System.out.println(contatos[i].toString());
		}
	}
}
