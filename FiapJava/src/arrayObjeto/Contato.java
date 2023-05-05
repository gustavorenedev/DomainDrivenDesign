package arrayObjeto;

public class Contato {

	private String nome;
	private String telefone;
	
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// método toString
	// formatar a frase que eu quero que apareça
	@Override
	public String toString() {
		System.out.println("*-* toString *-*");
		return "Nome: " + this.getNome() + 
				"\nTelefone:" + this.getTelefone() +
				"\n----------------------------";
	}
}
