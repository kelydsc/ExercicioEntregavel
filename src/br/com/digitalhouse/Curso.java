package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    //atributos
    private String nome;
    private int codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int qtdeMaximaAlunos;
    private List<Aluno> listaAluno = new ArrayList<>();

    //construtor padrão
    public Curso() {
    }

    //construtor especifico
    public Curso(String nome, int codigoCurso, int qtdeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
    }

    public Curso(String nome, int codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto,
                 int qtdeMaximaAlunos, List<Aluno> listaAluno) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
        this.listaAluno = listaAluno;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQtdeMaximaAlunos() {
        return qtdeMaximaAlunos;
    }

    public void setQtdeMaximaAlunos(int qtdeMaximaAlunos) {
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    //metodo
    @Override
    public boolean equals(Object outroCurso) {

        if (((Curso) outroCurso).getCodigoCurso() == this.getCodigoCurso()) {

            return true;

        } else {

            return false;
        }
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {

        int vagasDisponiveis = qtdeMaximaAlunos - listaAluno.size();

        if (vagasDisponiveis > 0) {

            listaAluno.add(umAluno);

            return true;

        } else {
            System.out.println("\nNão foi possivel realizar a matricula do: " + umAluno +
                    ", porque não há mais vagas no curso: " + nome);

            return false;
        }

    }

    public void excluirAluno(Aluno umAluno) {

        listaAluno.remove(umAluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", qtdeMaximaAlunos=" + qtdeMaximaAlunos +
                ", listaAluno=" + listaAluno +
                '}';
    }
}
