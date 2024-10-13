import java.util.Scanner;

public class App{
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira um número: ");
    int num = entrada.nextInt();
    
    System.out.println("Esse número é par?");
    System.out.println(Utilitario.ehPar(num)?"Sim.":"Não.");
    System.out.println(Utilitario.ehImpar(num)?"O número é ímpar.":"É par");
    System.out.println("E este número é primo? ");
    System.out.println(Utilitario.ehPrimo(num)?"Sim, é primo":"Não é Primo");
    
    
    
    }
}
