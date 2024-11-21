public class Musica extends Midia {
    private String artista;
    private String generoMusical;

    public Musica(String titulo, int anoLancamento, String categoria, String artista, String generoMusical) {
        super(titulo, anoLancamento, categoria);
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    @Override
    public String exibirInfo() {
        return "Título: " + getTitulo() + ", Ano de Lançamento: " + getAnoLancamento() + ", Categoria: " + getCategoria() +
               ", Artista: " + artista + ", Gênero Musical: " + generoMusical;
    }

    @Override
    public String tipoDeMidia() {
        return "Música";
    }
}
