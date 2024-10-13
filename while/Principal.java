import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        int contador = 1;
        while (contador<=50) {
            System.out.println(contador);
            contador++;
        }

        Scanner entrada = new Scanner(System.in);
        String nome;//criando uma variável
        System.out.println("Digite seu nome ou S para sair:");
        nome = entrada.nextLine();//scanneando a resposta
        while(!nome.equals("s")){/*confere se é igual a s ou não. o ponto de exclamação inverte o valor lógico
                                    em strings não usamos ==. Usamos o .equal.*/
            System.out.printf("Bem-vindo %s\n", nome);
            System.out.println("Digite seu nome ou S para sair:");
            nome = entrada.nextLine();
        }
        System.out.println("Fim da execução!");

        int numero;//numero que o usuário vai inserir
        int soma=0;
        int contador1=1;//contagem das repetições do while

        while (contador1<=10) {
            System.out.println("Digite o valor no numero "+contador1+":");
            numero = entrada.nextInt();
            soma+=numero;//pega o valor padrão da soma e acrescenta o número lido pelo scanner
            contador1++;//aumenta mais 1 no contador
        }
        System.out.println("A soma de todos os números é: "+soma);

        String nome1;
        double nota1, nota2;
        
        for(int i = 0; i<5; i++){
            System.out.println("Digite seu nome: ");
            nome1 = entrada.next();
            
            System.out.println("Digite a primeira nota:");
            nota1 = entrada.nextDouble();
            entrada.nextLine();
            
            System.out.println("Digite a segunda nota:");
            nota2 = entrada.nextDouble();
            entrada.nextLine();
            

            double soma1 = nota1+nota2;
            double media = soma1/2;

            if (media>=7) {
                System.out.println(nome1.toUpperCase()+" ESTÁ APROVADO!");
            }
            else if (media<7 && media>3) {
                System.out.println(nome1.toUpperCase()+" ESTÁ EM RECUPERAÇÃO");
            }
            else{
                System.out.println(nome1.toUpperCase()+" ESTÁ REPROVADO");
            }
            System.out.println("---------------------------------------------------------------------------");
        }

    }
}