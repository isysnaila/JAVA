public class Filme extends Midia {
    private String diretor;
    private int duracao;

    public Filme(String titulo, int anoLancamento, String categoria, String diretor, int duracao) {
        super(titulo, anoLancamento, categoria);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    @Override
    public String exibirInfo() {
        return "Título: " + getTitulo() + ", Ano de Lançamento: " + getAnoLancamento() + ", Categoria: " + getCategoria() +
               ", Diretor: " + diretor + ", Duração: " + duracao + " minutos";
    }

    @Override
    public String tipoDeMidia() {
        return "Filme";
    }
}
