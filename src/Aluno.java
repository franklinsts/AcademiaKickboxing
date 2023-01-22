public class Aluno {

    private int codMatricula, peso;
    private String nome, endereco, telefone, dataNascimento;
    private double altura;

    public Aluno(int codMatricula, int peso, String nome, String endereco, String telefone, String dataNascimento,
                 double altura) {
        this.codMatricula = codMatricula;
        this.peso = peso;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Código da matrícula:" + codMatricula + " Peso:" + peso + " Nome:" + nome + " Endereço:" + endereco
                + " Telefone:" + telefone + " Data de nascimento:" + dataNascimento + " Altura:" + altura;
    }

}