import java.sql.Date;

public class Aluno {

    private String nome;
    private String graduacao;
    private String genero;
    private Date nascimento;
    private Double altura;
    private Double peso;

    public Aluno (String nome, String graduacao, Date nascimento, String genero, int i, int j) {

        this.nome = nome;
        this.graduacao = graduacao;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

  //  public Aluno (String nome, String graduacao, Date nascimento) {
    //    this(nome, graduacao, nascimento);
    //}

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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;

    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
