package br.ufpb.pratColections;

public class Aluno implements Nomeavel{
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
