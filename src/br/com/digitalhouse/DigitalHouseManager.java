package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //atributos
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

    //construtor padrão
    public DigitalHouseManager() {
    }

    //construtor especifico
    public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaProfessores, List<Curso> listaCursos,
                               List<Matricula> listaMatriculas) {
        this.listaDeAlunos = listaDeAlunos;
        this.listaProfessores = listaProfessores;
        this.listaCursos = listaCursos;
        this.listaMatriculas = listaMatriculas;
    }

    //getter e setter
    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    //metodos
    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {

        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);

        listaCursos.add(curso);

    }

    public void excluirCurso(int codigoCurso) {

        Curso registroCurso = new Curso();

        Breakloop_Curso:
        for (Curso linha : listaCursos) {

            if (linha.getCodigoCurso() == codigoCurso) {

                registroCurso = linha;
            }
            break Breakloop_Curso;
        }
        listaCursos.remove(registroCurso);
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor,
                                          int quantidadeDeHoras) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0,
                codigoProfessor, quantidadeDeHoras);

        listaProfessores.add(professorAdjunto);

    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade) {

        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor,
                especialidade);

        listaProfessores.add(professorTitular);

    }

    public void excluirProfessor(int codigoProfessor) {

        Professor registroProfessor = new ProfessorTitular();

        Breakloop_Professor:
        for (Professor linha : listaProfessores) {

            if (linha.getCodigoProfessor() == codigoProfessor) {

                registroProfessor = linha;
            }
            break Breakloop_Professor;
        }
        listaProfessores.remove(registroProfessor);
    }

    public void matricularAluno(String nome, String sobrenome, int codigoAluno) {

        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);

        listaDeAlunos.add(aluno);
    }

    public void matricularAluno(int codigoAluno, int codigoCurso) {

        for (Curso cursoEncontrado : listaCursos) {

            if (cursoEncontrado.getCodigoCurso() == codigoCurso) {

                for (Aluno alunoEncontrado : listaDeAlunos) {

                    if (alunoEncontrado.getCodigoAluno() == codigoAluno) {

                        if (cursoEncontrado.adicionarUmAluno(alunoEncontrado) == true) {

                            Matricula matricula = new Matricula(alunoEncontrado, cursoEncontrado);

                            listaMatriculas.add(matricula);

                            System.out.println("Matricula realizada com sucesso: " + alunoEncontrado);
                        }
                    }
                }
            }
        }
    }

    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {

        ProfessorTitular professorTitular = new ProfessorTitular();

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();

        for (Professor professorChave : listaProfessores) {

            if (professorChave.getCodigoProfessor() == codigoProfessorTitular) {

                professorTitular.setNome(professorChave.getNome());
                professorTitular.setSobrenome(professorChave.getSobrenome());
                professorTitular.setCodigoProfessor(codigoProfessorTitular);
            }

            if (professorChave.getCodigoProfessor() == codigoProfessorAdjunto) {

                professorAdjunto.setNome(professorChave.getNome());
                professorAdjunto.setSobrenome(professorChave.getSobrenome());
                professorAdjunto.setCodigoProfessor(codigoProfessorAdjunto);

            }

            for (Curso cursoChave : listaCursos) {

                if (cursoChave.getCodigoCurso() == codigoCurso) {

                    cursoChave.setProfessorTitular(professorTitular);
                    cursoChave.setProfessorAdjunto(professorAdjunto);

                }
            }
        }
    }

    public void exibirCursos() {

        System.out.println("\nDigitalHouseManager: ");

        for (Curso valor : listaCursos) {

            System.out.println(valor);
        }
    }
}
