public class Instrutor {

    private String rg, nome, titulacao, dataNascimento, telefone;

    public Instrutor(String rg, String nome, String titulacao, String dataNascimento, String telefone) {
        this.rg = rg;
        this.nome = nome;
        this.titulacao = titulacao;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Rg:" + rg + " Nome:" + nome + " Titulação:" + titulacao + " Data de nascimento:"
                + dataNascimento + " Telefone:" + telefone;
    }

}