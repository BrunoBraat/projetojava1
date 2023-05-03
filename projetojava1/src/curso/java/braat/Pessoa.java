package curso.java.braat;

import java.util.Date;

public class Pessoa {

	/*Atributos*/
	private String nome;
	
	private String sobrenome;

	private int idade;
	
	private Date dataNascimento;
	
	private String endereco;
	
	private String profissao;
	
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getProfissao() {
		return profissao;
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

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
