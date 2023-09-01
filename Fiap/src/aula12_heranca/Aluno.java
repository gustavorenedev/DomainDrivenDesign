package aula12_heranca;

public class Aluno extends Pessoa{
	// Aluno herda da pessoa
	
	private String matricula;
	private double mensalidade;
	private float notaGeral;
	private String curso;
	
	public Aluno(String nome, String cpf, String rg, String dataNascimento, String matricula, double mensalidade,
			float notaGeral, String curso) {
		super(nome, cpf, rg, dataNascimento);
		this.matricula = matricula;
		this.mensalidade = mensalidade;
		this.notaGeral = notaGeral;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public float getNotaGeral() {
		return notaGeral;
	}

	public void setNotaGeral(float notaGeral) {
		this.notaGeral = notaGeral;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
