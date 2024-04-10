import java.util.LinkedHashSet;

public class Dev  {
    private String nome;
    private int idade;

    private LinkedHashSet <Conteudo> conteudos = new LinkedHashSet<>();

    public Dev (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getNome () {
        return nome;
    }

    public int getIdade () {
        return idade;
    }

    public void matricular (Conteudo conteudo) {
        conteudo.matricularAluno(this);
        conteudos.add(conteudo);
    }

    public void desmatricular (Conteudo conteudo) {
        conteudo.desmatricularAluno(this);
        conteudos.remove(conteudo);
    }

    public LinkedHashSet<Conteudo> getConteudos () {
        return conteudos;
    }

    public String toString () {
        return "{ " + nome + ", " + idade + " }";
    }

    
}
