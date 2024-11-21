import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Fapam");

        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(new Autor("Agatha Christie", 1890));
        autores.add(new Autor("Stephen King", 1947));

        Livro livro1 = new Livro("Cem Gramas de Centeio", 1953, "Suspense", autores, 300);
        Livro livro2 = new Livro("Depois", 2024, "Terror", autores, 250);
        Filme filme1 = new Filme("Filme 1", 2020, "Ação", "Diretor 1", 120);
        Musica musica1 = new Musica("Música 1", 2021, "Pop", "Artista 1", "Pop");

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(livro2);
        biblioteca.adicionarMidia(filme1);
        biblioteca.adicionarMidia(musica1);

        System.out.println(biblioteca.listarMidias());
        System.out.println(biblioteca.exibirDetalhesMidia("Depois"));
        System.out.println("Mídias lançadas em 2020: " + biblioteca.contarMidiasPorAno(2020));
        System.out.println(Utilidades.exibirPorCategoria(biblioteca.getColecaoMidias(), "Terror"));
    }
}
