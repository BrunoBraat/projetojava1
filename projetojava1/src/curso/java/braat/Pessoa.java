package curso.java.braat;

public class Pessoa {

	/*Atributos*/
	private String nome;
	
	private String sobrenome;

	private int idade;
	
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

}
