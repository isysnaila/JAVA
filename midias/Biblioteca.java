public class Biblioteca {
    private String nome;
    private Midia[] colecaoMidias;
    private int indiceAtual;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.colecaoMidias = new Midia[20];
        this.indiceAtual = 0;
    }

    public void adicionarMidia(Midia midia) {
        if (indiceAtual < colecaoMidias.length) {
            colecaoMidias[indiceAtual] = midia;
            indiceAtual++;
        } else {
            System.out.println("A biblioteca está cheia!");
        }
    }

    public String listarMidias() {
        StringBuilder lista = new StringBuilder("Lista de Mídias na Biblioteca:\n");
        for (int i = 0; i < indiceAtual; i++) {
            lista.append(colecaoMidias[i].getTitulo()).append(" - ").append(colecaoMidias[i].tipoDeMidia()).append("\n");
        }
        return lista.toString();
    }

    public String exibirDetalhesMidia(String titulo) {
        for (int i = 0; i < indiceAtual; i++) {
            if (colecaoMidias[i].getTitulo().equalsIgnoreCase(titulo)) {
                return colecaoMidias[i].exibirInfo();
            }
        }
        return "Mídia não encontrada.";
    }

    public int contarMidiasPorAno(int ano) {
        int count = 0;
        for (int i = 0; i < indiceAtual; i++) {
            if (colecaoMidias[i].getAnoLancamento() == ano) {
                count++;
            }
        }
        return count;
    }

    // Método público para retornar o array de mídias
    public Midia[] getColecaoMidias() {
        return colecaoMidias;
    }
}
