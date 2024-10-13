public class Pessoa{
    private final String cpf;
    private String nome;
    private int nota;

    public Pessoa(String cpf){
        this.cpf = cpf;
        this.nome = "Aluno sem nome";
    }

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        setNome(nome);
    }

    public String rendimento(){
        String retorno;
        if (nota<6) {
            retorno="baixo";
        }
        else if (nota<8) {
            retorno="normal";
        }
        else{
            retorno="alto";
        }
        return retorno;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getNota(){
        return nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(int nota){
        this.nota = nota;
    }
}