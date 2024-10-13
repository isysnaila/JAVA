import java.util.Scanner;
public class Apprevisao {
    
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        Computador comp = new Computador();

        System.out.println("Informações iniciais:");
        comp.exibirEspecificacoes();
        System.out.println("Vamos atualizar as informações no computador. Insira a marca:");
        String marca = pc.nextLine();
        System.out.println("Insira o novo valor de memória ram:");
        int memoriaRam = pc.nextInt();
        System.out.println("Insira o novo armazenamento:");
        int armazenamento = pc.nextInt();

        comp.atualizarEspecificacoes(marca,memoriaRam,armazenamento);
        System.out.println("Essas são as informações atualizadas do seu computador: ");
        comp.exibirEspecificacoes();
        comp.verificarDesempenho();

    }
}
