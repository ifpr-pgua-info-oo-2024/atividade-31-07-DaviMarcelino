import java.util.Date;

public class Aluno {

    private String nome;
    private String graduacao;
    private String genero;
    private Date nascimento;
    private double altura;
    private double peso;

    public Aluno (String nome, String graduacao, Date nascimento, String genero, double altura, double peso) {

        this.nome = nome;
        this.graduacao = graduacao;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String graduacao, Date nascimento) {
    this(nome, graduacao, nascimento,"",0,0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento (Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;

    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", graduacao=" + graduacao + ", genero=" + genero + ", nascimento=" + nascimento
                + ", altura=" + altura + ", peso=" + peso + "]";
    }

}
