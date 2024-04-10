import java.util.LinkedHashSet;

public abstract class Conteudo  {
    protected String nome;
    protected String descricao;
    protected LinkedHashSet <Dev> alunos = new LinkedHashSet<>();

    public Conteudo (String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome () {
        return nome;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public abstract void matricularAluno(Dev aluno);
    public abstract void desmatricularAluno(Dev aluno);


    
}
