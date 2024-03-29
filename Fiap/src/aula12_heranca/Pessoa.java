package aula12_heranca;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	
	public Pessoa(String nome, String cpf, String rg, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//mostrar os dados do objeto Pessoa - toString
	@Override
	public String toString() {
		return "Pessoa [Nome: " + getNome()
		+ "\nCPF: " + getCpf()
		+ "\nRG: " + getRg()
		+ "\nData de Nascimento: " + getDataNascimento() + "]";
	}
	
}
