package Aula18_lambdastream;

public class Pessoa {
	private Integer idade;
	private String nome;
	
	public Pessoa(String nome, Integer idade) {
		this.idade = idade;
		this.nome = nome;
	}
	public Pessoa() {
		
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
