package br.com.digitalhouse;

public class ProfessorTitular extends Professor {

    //atributos
    private String especialidade;

    //construtor padrão
    public ProfessorTitular() {
    }

    //construtor especifico
    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor,
                            String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    //getter e setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    //metodos
    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", codigoProfessor=" + getCodigoProfessor() +
                '}';
    }
}
