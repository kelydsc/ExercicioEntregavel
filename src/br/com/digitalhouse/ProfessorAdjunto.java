package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    //atributos
    private int qtdeHorasMonitoria;

    //construtor padrão
    public ProfessorAdjunto() {
    }

    //construtor especifico
    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor, int qtdeHorasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

    //getter e setter
    public int getQtdeHorasMonitoria() {
        return qtdeHorasMonitoria;
    }

    public void setQtdeHorasMonitoria(int qtdeHorasMonitoria) {
        this.qtdeHorasMonitoria = qtdeHorasMonitoria;
    }

    //metodos
    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", codigoProfessor=" + getCodigoProfessor() +
                '}';
    }
}
