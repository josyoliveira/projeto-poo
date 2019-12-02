package Tela;

import java.util.Scanner;

import modelo.BancoDados;

public class Tela {

	private Scanner lerOpcao = new Scanner(System.in);
	private BancoDados bancoDeDados;

	public Tela() {
		bancoDeDados = new BancoDados();
	}

	public void menu() {

		String opcao = "0";
		exibirMsg("<1> Realizar Cadastro de Curso");
		exibirMsg("<2> Realizar Cadastro de Aluno");
		exibirMsg("<3> Realizar Cadastro de Instrutor");
		exibirMsg("<4> Listar Curso");
		exibirMsg("<5> Remover Curso");
		exibirMsg("<6> Atualizar Curso");
		exibirMsg("<7> Listar Instrutor ");
		exibirMsg("<8> Remover Instrutor ");
		exibirMsg("<9> Atualizar Instrutor ");
		exibirMsg("<10> Lista Aluno");
		exibirMsg("<11> Remover Aluno");
		exibirMsg("<12> Atualizar Aluno");
		exibirMsg("<13> Adiciona Aluno ao Curso");
		exibirMsg("Escolha a op��o: ");
		opcao = lerOpcao.nextLine();

		if (opcao.equals("1")) {
			menuCadastrarCurso();
		} else if (opcao.equals("2")) {
			cadastrarAluno();
		} else if (opcao.equals("3")) {
			cadastrarInstrutor();
		} else if (opcao.equals("4")) {
			listarCurso();
		} else if (opcao.equals("5")) {
			deletarCurso();
		}else if(opcao.equals("6")) {
			atualizarCurso();
		}else if (opcao.equals("7")) {
			listarInstrutor();
		}
		else if (opcao.equals("8")) {
			deletarInstrutor();
		}else if (opcao.equals("9")) {
			atualizarInstrutor();
		}else if(opcao.equals("10")) {
			listarAluno();
		}else if(opcao.equals("11")) {
			removerAluno();
		}else if(opcao.equals("12")) {
			atualizarAluno();
		}else if(opcao.equals("13")) {
			adicionarAlunoAoCurso();
		}

		menu();
	}

	private void exibirMsg(String msg) {
		System.out.println(msg);
	}

	private void menuCadastrarCurso() {

		Scanner lerDados = new Scanner(System.in);

		System.out.println("Digite o codigo: ");
		String codigoTemp = lerDados.nextLine();
		int codigo = Integer.parseInt(codigoTemp);
		System.out.println("Digite o nome: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite a carga horaria: ");
		String cargaHorariaTemp = lerDados.nextLine();
		int cargaHoraria = Integer.parseInt(cargaHorariaTemp);

		bancoDeDados.cadastrarCurso(codigo, nome, cargaHoraria);
	}

	private void listarCurso() {
		bancoDeDados.listarCurso();
	}

	private void deletarCurso() {
		bancoDeDados.listarCurso();
		Scanner lerIndice = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso a ser excluido: ");
		int indice = lerIndice.nextInt();
		bancoDeDados.deletarCurso(indice);
	}

	private void atualizarCurso() {
		bancoDeDados.listarCurso();
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso para atualizar: ");
		String indiceTemp = lerDados.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Curso: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite a carga horaria do Curso: ");
		String cargaHorariaTemp = lerDados.nextLine();
		int cargaHoraria = Integer.parseInt(cargaHorariaTemp);
		bancoDeDados.atualizarCurso(indice, nome, cargaHoraria);
	}

	private void cadastrarInstrutor() {
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = lerDados.nextLine();

		bancoDeDados.cadastrarInstrutor(nome, cpf);
	}

	private void deletarInstrutor() {
		bancoDeDados.listarInstrutor();
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite o c�digo de Instrutor para remove-lo: ");
		int indice = lerDados.nextInt();
		bancoDeDados.deletarInstrutor(indice);
	}

	private void listarInstrutor() {
		bancoDeDados.listarInstrutor();
	}

	private void atualizarInstrutor() {
		bancoDeDados.listarCurso();
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso para atualizar: ");
		String indiceTemp = lerDados.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Curso: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite o CPF do Instrutor: ");
		String cpf = lerDados.nextLine();

		bancoDeDados.atualizarInstrutor(indice, nome, cpf);
	}
	private void cadastrarAluno() {
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite sua Matricula: ");
		String matricula = lerDados.nextLine();
		System.out.println("Digite seu nome: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = lerDados.nextLine();

		bancoDeDados.cadastrarAluno(matricula, nome, cpf);
	}
	private void listarAluno() {
		bancoDeDados.listarAluno();
	}
	private void removerAluno() {
		bancoDeDados.listarAluno();
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite o c�digo o Aluno para remove-lo: ");
		int indice = lerDados.nextInt();
		bancoDeDados.removerAluno(indice);
	}
	private void atualizarAluno() {
		bancoDeDados.listarCurso();
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Digite o c�digo do aluno para atualizar: ");
		String indiceTemp = lerDados.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Aluno: ");
		String nome = lerDados.nextLine();
		System.out.println("Digite o CPF do Aluno: ");
		String cpf = lerDados.nextLine();
		bancoDeDados.atualizarAluno(indice, nome, cpf);
	}
	private void adicionarAlunoAoCurso() {
		bancoDeDados.listarCurso();
		bancoDeDados.listarAluno();
		Scanner lerIndice = new Scanner(System.in);
		System.out.println("Digite o �ndice do Curso: ");
		int indiceCurso = lerIndice.nextInt();
		System.out.println("Digite o �dice do Aluno: ");
		int indiceAluno = lerIndice.nextInt();
		bancoDeDados.salvarAlunoEmCurso(indiceCurso, indiceAluno);
	}

}
