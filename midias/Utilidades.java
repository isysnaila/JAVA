public class Utilidades {
    public static String exibirPorCategoria(Midia[] midias, String categoria) {
        StringBuilder lista = new StringBuilder("Mídias da Categoria: " + categoria + "\n");
        for (Midia midia : midias) {
            if (midia != null && midia.getCategoria().equalsIgnoreCase(categoria)) {
                lista.append(midia.getTitulo()).append(" - ").append(midia.tipoDeMidia()).append("\n");
            }
        }
        return lista.toString();
    }
}
