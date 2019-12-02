package modelo;

import java.util.ArrayList;

public class BancoDados {

	private static ArrayList<Curso> cursos;
	private static ArrayList<Instrutor> instrutores;
	private static ArrayList<Aluno> alunos;

	public BancoDados() {
		super();
		this.cursos = new ArrayList<Curso>();
		this.instrutores = new ArrayList<Instrutor>();
		this.alunos = new ArrayList<Aluno>();
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(ArrayList<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}


	public static void cadastrarInstrutor(String nome, String cpf) {
		int indice = 0;
		instrutores.add(new Instrutor(nome, cpf));
		indice = instrutores.size() - 1;
		System.out.println("Instrutor " + instrutores.get(indice).getNome() + " foi Cadastrado com Sucesso!");
	}

	public static void listarInstrutor() {
		boolean estaVazia = instrutores.isEmpty();
		if (estaVazia) {
			System.out.println("Est� vazio");
		}
		int indice = 0;
		for (Instrutor instrutor : instrutores) {
			System.out.println(indice + " - " + instrutor.getNome());
			indice++;
		}
	}

	public static void deletarInstrutor(int indice) {
		String nomeInstrutorRemovido = "";
		if (indice != -1) {
			nomeInstrutorRemovido = instrutores.get(indice).getNome();
			instrutores.remove(indice);
			System.out.println("O " + nomeInstrutorRemovido + " foi deletado!!");
		} else {
			System.out.println("Algum dos dados n�o foi informado corretamente");
		}
	}

	public static void atualizarInstrutor(int indice, String nome, String cpf) {
		if (indice != -1) {
			instrutores.get(indice).setNome(nome);
			instrutores.get(indice).setCpf(cpf);
			System.out.println("O " + instrutores.get(indice).getNome() + " foi Atualizado");
		}
	}

	public static void deletarCurso(int indice) {
		String nomeCursoRemovido = "";
		if (indice != -1) {
			nomeCursoRemovido = cursos.get(indice).getNome();
			cursos.remove(indice);
			System.out.println("O " + nomeCursoRemovido + " foi deletado!!");
		} else {
			System.out.println("Algum dos dados n�o foi informado corretamente");
		}
	}

	public static void cadastrarCurso(int codigo, String nome, int cargaHoraria) {

		int indice = 0;
		cursos.add(new Curso(codigo, nome, cargaHoraria));
		indice = cursos.size() - 1;
		System.out.println("Curso " + cursos.get(indice).getNome() + " foi Cadastrado com Sucesso!");
	}

	public static void listarCurso() {
		boolean estaVazia = cursos.isEmpty();
		if (estaVazia) {
			System.out.println("Esta vazia!");
		}

		int indice = 0;
		for (Curso curso : cursos) {
			System.out.println(indice + " - " + curso.getNome());
			indice++;
		}
	}

	public static void atualizarCurso(int indice, String nome, int cargaHoraria) {
		if (indice != -1) {
			cursos.get(indice).setNome(nome);
			cursos.get(indice).setCargaHoraria(cargaHoraria);
			System.out.println("O " + cursos.get(indice).getNome() + " foi Atualizado");
		}
	}

	public static void cadastrarAluno(String matricula, String nome, String cpf) {
		Aluno aluno = new Aluno(matricula, nome, cpf);
		alunos.add(aluno);
		
		System.out.println("Aluno " + aluno.getNome() + " foi cadastrado com sucesso");
	}

	public static void listarAluno() {
		boolean estaVazio = alunos.isEmpty();
		if(estaVazio) {
			System.out.println("Est� Vazio");
		}
		int indice = 0;
		for (Aluno aluno : alunos) {
			System.out.println(indice + " - " +aluno.getNome());
			indice++;
		}
	}
	
	public static void removerAluno(int indice) {
		String nomeAlunoRemovido = "";
		if (indice != -1) {
			nomeAlunoRemovido = alunos.get(indice).getNome();
			alunos.remove(indice);
			System.out.println("O " + nomeAlunoRemovido + " foi deletado!!");
		} else {
			System.out.println("Algum dos dados n�o foi informado corretamente");
		}
	}
	public static void atualizarAluno(int indice, String nome, String cpf) {
		if (indice != -1) {
			alunos.get(indice).setNome(nome);
			alunos.get(indice).setCpf(cpf);
			System.out.println("O " + alunos.get(indice).getNome() + " foi Atualizado");
		}
	}
	public static void salvarAlunoEmCurso(int indiceCurso, int indiceAluno) {
		Aluno aluno = alunos.get(indiceAluno);
		cursos.get(indiceCurso).getAlunos().add(aluno);
		System.out.println("Aluno foi adicionado ao Curso!!");
		for (Aluno ultimoAluno : cursos.get(indiceCurso).getAlunos()) {
			System.out.println(ultimoAluno.getNome());	
		}
	}
}
