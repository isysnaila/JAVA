import java.util.Scanner;

public class Aplicativo{

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Quantos números quer utilizar?");
        int quantidade = ent.nextInt();
        int []valores = new int[quantidade];//declarando a lista(array)
        int total=0;
        
        System.out.println("Digite os valores:");
        for (int i=0; i<quantidade;i++) {//for funciona até a quantidade selecionada em quantidade
            valores[i]=ent.nextInt();//recebe um valor pelo usuário usando o scanner e já o adiciona na lista
            total+=valores[i];//soma o valor total de todos os ítens da lista
        }

        System.out.println("Veja os números digitados na ordem contrária:");
        for(int i=0; i<quantidade;i++){
            System.out.println(valores[quantidade-i-1]);
        }
        /* forma alternativa
        for(int i=quantidade-1; i>=0;i--){
            System.out.println(valores[i]);
        }*/

        System.out.println("Veja sua lista: ");

        for (int x : valores) {
            System.out.println(x);
        }
        System.out.println("A soma dos números é: "+total);
    }
}