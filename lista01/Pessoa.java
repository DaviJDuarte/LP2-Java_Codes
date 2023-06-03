// Exercício 1: escreva o código fonte da classe Pessoa, incluir os atributos nome (String) e nascimento (LocalDate), 2 métodos construtores, métodos get/set e método toString da classe Object.

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;

	public Pessoa() {
		this.nome = "";
		this.nascimento = LocalDate.now();
	}

	public Pessoa(String nome, Integer dia, Integer mes, Integer ano) {
		this.nome = nome;
		this.nascimento = LocalDate.of(ano, mes, dia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String toString() {
		return "Pessoa [Nome: " + nome + ", Nascimento: " + nascimento + "]";
	}
}