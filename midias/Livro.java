import java.util.ArrayList;

public class Livro extends Midia {
    private ArrayList<Autor> autores;
    private int numeroPaginas;

    public Livro(String titulo, int anoLancamento, String categoria, ArrayList<Autor> autores, int numeroPaginas) {
        super(titulo, anoLancamento, categoria);
        this.autores = autores;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String exibirInfo() {
        return "Título: " + getTitulo() + 
               ", Ano de Lançamento: " + getAnoLancamento() + 
               ", Categoria: " + getCategoria() + 
               ", Autores: " + listarAutores() + 
               ", Número de Páginas: " + numeroPaginas;
    }

    @Override
    public String tipoDeMidia() {
        return "Livro";
    }

    public String listarAutores() {
        if (autores.isEmpty()) {
            return "Nenhum autor listado.";
        } else if (autores.size() == 1) {
            return autores.get(0).getNome();
        } else {
            String listaAutores = autores.get(0).getNome();
            for (int i = 1; i < autores.size(); i++) {
                listaAutores += ", " + autores.get(i).getNome();
            }
            return listaAutores;
        }
    }
}
