public class Autor{
    private String nome;
    private int anoNascimento;

    public Autor(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String exibirAutor(){
        return "Nome: "+ getNome()+". Ano de Nascimento: "+ getAnoNascimento();
    }

    public int calcularIdade(int anoAtual){
        return anoAtual-getAnoNascimento();
    }
}