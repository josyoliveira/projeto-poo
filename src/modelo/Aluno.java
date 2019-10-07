package modelo;

public class Aluno extends Pessoa{
	
	private String matricula;
	
	public Aluno(String matricula, String nome, String cpf) {
		super(nome, cpf);
		this.matricula = matricula;

	}
	
	
	public String getMatricula() {
		return matricula;
	}
}
