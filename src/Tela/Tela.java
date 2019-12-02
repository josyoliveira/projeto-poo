package Tela;

import java.util.Scanner;

import modelo.BancoDados;
import modelo.Curso;

public class Tela {

	private Scanner ler = new Scanner(System.in);
	private BancoDados banco;
	private Curso cursos;

	public Tela() {
		banco = new BancoDados();
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
		opcao = ler.nextLine();

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

		Scanner lerInfo = new Scanner(System.in);

		System.out.println("Digite o codigo: ");
		String codigoTemp = lerInfo.nextLine();
		int codigo = Integer.parseInt(codigoTemp);
		System.out.println("Digite o nome: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite a carga horaria: ");
		String cargaHorariaTemp = lerInfo.nextLine();
		int cargaHoraria = Integer.parseInt(cargaHorariaTemp);

		banco.cadastrarCurso(codigo, nome, cargaHoraria);
	}

	private void listarCurso() {
		banco.listarCurso();
	}

	private void deletarCurso() {
		banco.listarCurso();
		Scanner lerIndice = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso a ser excluido: ");
		int indice = lerIndice.nextInt();
		banco.deletarCurso(indice);
	}

	private void atualizarCurso() {
		banco.listarCurso();
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso para atualizar: ");
		String indiceTemp = lerInfo.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Curso: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite a carga horaria do Curso: ");
		String cargaHorariaTemp = lerInfo.nextLine();
		int cargaHoraria = Integer.parseInt(cargaHorariaTemp);
		banco.atualizarCurso(indice, nome, cargaHoraria);
	}

	private void cadastrarInstrutor() {
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = lerInfo.nextLine();

		banco.cadastrarInstrutor(nome, cpf);
	}

	private void deletarInstrutor() {
		banco.listarInstrutor();
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite o c�digo de Instrutor para remove-lo: ");
		int indice = lerInfo.nextInt();
		banco.deletarInstrutor(indice);
	}

	private void listarInstrutor() {
		banco.listarInstrutor();
	}

	private void atualizarInstrutor() {
		banco.listarCurso();
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite o c�digo do curso para atualizar: ");
		String indiceTemp = lerInfo.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Curso: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite o CPF do Instrutor: ");
		String cpf = lerInfo.nextLine();

		banco.atualizarInstrutor(indice, nome, cpf);
	}
	private void cadastrarAluno() {
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite sua Matricula: ");
		String matricula = lerInfo.nextLine();
		System.out.println("Digite seu nome: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = lerInfo.nextLine();

		banco.cadastrarAluno(matricula, nome, cpf);
	}
	private void listarAluno() {
		banco.listarAluno();
	}
	private void removerAluno() {
		banco.listarAluno();
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite o c�digo o Aluno para remove-lo: ");
		int indice = lerInfo.nextInt();
		banco.removerAluno(indice);
	}
	private void atualizarAluno() {
		banco.listarCurso();
		Scanner lerInfo = new Scanner(System.in);
		System.out.println("Digite o c�digo do aluno para atualizar: ");
		String indiceTemp = lerInfo.nextLine();
		int indice = Integer.parseInt(indiceTemp);
		System.out.println("Digite o nome do Aluno: ");
		String nome = lerInfo.nextLine();
		System.out.println("Digite o CPF do Aluno: ");
		String cpf = lerInfo.nextLine();
		banco.atualizarAluno(indice, nome, cpf);
	}
	private void adicionarAlunoAoCurso() {
		banco.listarCurso();
		banco.listarAluno();
		Scanner lerIndice = new Scanner(System.in);
		System.out.println("Digite o �ndice do Curso: ");
		int indiceCurso = lerIndice.nextInt();
		System.out.println("Digite o �dice do Aluno: ");
		int indiceAluno = lerIndice.nextInt();
		banco.salvarAlunoEmCurso(indiceCurso, indiceAluno);
		//cursos.listaAlunosDoCurso();
	}

}
