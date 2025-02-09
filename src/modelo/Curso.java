package modelo;

import java.util.ArrayList;

public class Curso {
	private int codigo;
	private String nome;
	private int cargaHoraria;
	private ArrayList<Aluno> aluno;

	public Curso(int codigo, String nome, int cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.aluno = new ArrayList<Aluno>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public ArrayList<Aluno> getAlunos() {
		return aluno;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.aluno = alunos;
	}
}
