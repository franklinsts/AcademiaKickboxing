import java.util.ArrayList;

public class Turma {

    public ArrayList<Aluno> lista = new ArrayList<Aluno>();

    private int nAlunos, duracao;
    private String dtInicial, dtFinal, horario, tipoAtividade;
    private Instrutor instrutor;
    public Turma(int nAlunos, int duracao, String dtInicial, String dtFinal, String horario, String tipoAtividade, Instrutor instrutor) {
        super();
        this.nAlunos = nAlunos;
        this.duracao = duracao;
        this.dtInicial = dtInicial;
        this.dtFinal = dtFinal;
        this.horario = horario;
        this.tipoAtividade = tipoAtividade;
        this.instrutor = instrutor;
    }
    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }

    public int getnAlunos() {
        return lista.size();
    }
    public void setnAlunos(int nAlunos) {
        this.nAlunos = nAlunos;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getDtInicial() {
        return dtInicial;
    }
    public void setDtInicial(String dtInicial) {
        this.dtInicial = dtInicial;
    }
    public String getDtFinal() {
        return dtFinal;
    }
    public void setDtFinal(String dtFinal) {
        this.dtFinal = dtFinal;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getTipoAtividade() {
        return tipoAtividade;
    }
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
    public Instrutor getInstrutor() {
        return instrutor;
    }
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    public void matricular(Aluno a1) {
        lista.add(a1);
    }
    @Override
    public String toString() {
        return "Número de alunos:" + nAlunos + " Duração:" + duracao +"h"+ " Data inicial:" + dtInicial + " Data final:"
                + dtFinal + " Horario:" + horario + " Tipo de atividade:" + tipoAtividade + " Instrutor:" + instrutor;
    }

}