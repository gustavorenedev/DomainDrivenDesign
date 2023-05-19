package Heranca;

import java.util.Date;

public class Aluno extends Pessoa{
	private String matricula; 
	private String curso;
	private double mensalidade;
	
	public Aluno(String matricula, String curso, double mensalidade, Date dataNascimento, String cpf, String nome) {
		// heranca
		super(dataNascimento, cpf, nome);
		this.matricula = matricula;
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
