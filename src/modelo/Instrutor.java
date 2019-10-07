package modelo;

public class Instrutor extends Pessoa{
	private String senha;
	
	public Instrutor(String nome, String cpf, String senha) {
		super(nome, cpf);
		this.senha = senha;
	}
	
	
	public Instrutor(String nome, String cpf) {
		super(nome, cpf);

	}


	public String getSenha() {
		return senha;
	}

}
