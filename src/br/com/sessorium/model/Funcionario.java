package br.com.sessorium.model;

public abstract class Funcionario {
	
	int matricula;
	String nome;
	String cargo;
	
	public Funcionario(int matricula, String nome, String cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
	}
	
}
