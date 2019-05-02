package br.com.digitalhouse;

public class Aluno {

    //atributos
    private String nome;
    private String sobrenome;
    private int codigoAluno;

    //construtor padrão

    //construtor especifico
    public Aluno(String nome, String sobrenome, int codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    //Metodos
    @Override
    public boolean equals(Object outroAluno) {

        if (((Aluno) outroAluno).getCodigoAluno() == this.getCodigoAluno()) {

            return true;

        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoAluno=" + codigoAluno +
                '}';
    }
}
