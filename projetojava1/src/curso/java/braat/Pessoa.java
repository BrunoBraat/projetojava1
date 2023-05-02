package curso.java.braat;

import java.util.Date;

public class Pessoa {

	/*Atributos*/
	private String nome;
	
	private String sobrenome;

	private int idade;
	
	private Date dataNascimento;
	
	private String endereco;
	
	/*Metodos*/
	
	/*GET*/
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
		
	/*SET*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
