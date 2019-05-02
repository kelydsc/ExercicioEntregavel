package br.com.digitalhouse;

import java.util.Date;

public class Matricula {

    //atributos
    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula = new Date();

    //construtor padrão

    //construtor especifico
    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    //getter e setter
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    //metodos
    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataDeMatricula=" + dataDeMatricula +
                '}';
    }
}
