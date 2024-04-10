import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(String nome, String descricao) {
        super(nome, descricao);
        this.data = LocalDate.now();
    }

    public void setData (LocalDate data) {
        
        this.data = data;
    }

    public LocalDate getData () {
        return data;
    }

    @Override
    public void matricularAluno(Dev aluno) {
       super.alunos.add(aluno);
    }
    
    @Override
    public void desmatricularAluno(Dev aluno) {
       super.alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return "{ \n Mentoria " + nome + ", \n " + descricao + ", \n " + data + ", \n" + super.alunos + "\n}";
    }

    

    

    
}
