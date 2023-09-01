package aula12_heranca;

public class Professor extends Pessoa{

	private String funcional;
	private String disciplina;
	private double salario;
	
	public Professor(String nome, String cpf, String rg, String dataNascimento, String funcional, String disciplina,
			double salario) {
		super(nome, cpf, rg, dataNascimento);
		this.funcional = funcional;
		this.disciplina = disciplina;
		this.salario = salario;
	}

	public String getFuncional() {
		return funcional;
	}

	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [Nome: " + getNome()
		+ "\nCPF: " + getCpf()
		+ "\nRG: " + getRg()
		+ "\nData de Nascimento: " + getDataNascimento() + "]";
	}
	
}
