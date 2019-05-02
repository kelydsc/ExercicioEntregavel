package br.com.digitalhouse;

public abstract class Professor {

    //atributos
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoProfessor;

    //construtor padrão
    public Professor() {
    }

    //construtor especifico
    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
    }

    //getter e setter
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

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    //metodos
    @Override
    public boolean equals(Object outroProfessor) {

        if (((Professor) outroProfessor).getCodigoProfessor() == this.getCodigoProfessor()) {

            return true;

        } else {

            return false;
        }
    }
}
