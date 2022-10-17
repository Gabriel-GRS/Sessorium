package br.com.sessorium.model;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(2002,"João",10);
		
		Coordenador co = new Coordenador(1000,"José","Coordenador");
		
		co.consultaAluno(aluno);
	}
}
