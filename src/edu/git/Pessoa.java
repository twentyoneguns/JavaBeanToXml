package edu.git;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.setNome("");
		this.setIdade(0);
		
	}

	public Pessoa(String nome, int idade){
		this.setNome(nome);
		this.setIdade(idade);
		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
