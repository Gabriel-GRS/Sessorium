package br.com.sessorium.model;

public class Coordenador extends Funcionario {

	public Coordenador(int matricula, String nome, String cargo) {
		super(matricula, nome, cargo);
	}
	
	
	public void cadastrarAluno(Aluno a) {
		// TODO: implementar este quando aprender Array
	}
	
	public void consultaAluno(Aluno a) {
		System.out.println("Nome do aluno: " + a.getNome());
		System.out.println("Matrícula do aluno: " + a.getMatricula());
		System.out.println("Turma do aluno: " + a.getIdTurma());
	}
	
}
