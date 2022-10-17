package br.com.sessorium.model;

public class Aluno {
	private int matricula;
	private String nome;
	private int idTurma;
	
	public Aluno(int matricula, String nome, int idTurma) {
		this.matricula = matricula;
		this.nome = nome;
		this.idTurma = idTurma;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdTurma() {
		return this.idTurma;
	}

}
