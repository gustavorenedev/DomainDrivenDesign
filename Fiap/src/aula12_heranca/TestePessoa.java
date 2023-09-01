package aula12_heranca;

public class TestePessoa {

	public static void main(String[] args) {
	
		Pessoa p = new Pessoa("Pessoa 1", "123.456.789-10", "1.23.456-7", "02/07/2003");
		System.out.println(p.toString());
		
		Aluno a1 = new Aluno("Aluno 1", "123.456.789-10", "1.23.456-7", "02/07/2003", "RA123", 800, 9, "ADS");
		System.out.println(a1.toString());
		
		Professor p1 = new Professor("Professor 1", "123.456.789-10", "1.23.456-7", "02/07/2003", "pf1234", "Java", 1000);
		System.out.println(p1.toString());
	}
}



/* Entidades
 * Professor(funcional,disciplina, salario)
 * Aluno(matricula, curso, nota, mensalidade)
 * Funcionario(funcional, curso)
 * Coordenador(funcional, curso, salario)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
 * 
 * */
 
/*
 * Poderiamos criar uma classe pessoa para facilitar essa repetição
 * 
 * Pessoa(nome, rg, cpf, dataNascimento)
 * */