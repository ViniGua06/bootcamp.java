import java.time.LocalDate;

public class Bootcamp extends Conteudo {

    private LocalDate dataInicial;
    private LocalDate dataFinal;

    
    

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        super(nome, descricao);
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public void setDataInicial (LocalDate data) {
        this.dataInicial = data;
    } 
    public void setDataFinal (LocalDate data) {
        this.dataFinal = data;
    } 

    public LocalDate getDataInicial () {
        return dataInicial;
    }

    public LocalDate getDataFinal () {
        return dataFinal;
    }

    @Override
    public void matricularAluno(Dev aluno) {
        alunos.add(aluno);
    }

    @Override
    public void desmatricularAluno(Dev aluno) {
        alunos.remove(aluno);
    }

    
    
}
