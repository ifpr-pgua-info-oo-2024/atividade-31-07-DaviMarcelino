import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private String endereço;
    private String telefone;

    List<Aluno> alunos;

    public Academia(String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
