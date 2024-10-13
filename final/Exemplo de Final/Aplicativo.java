import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Pessoa[] turma = new Pessoa[3];
        Scanner ent = new Scanner(System.in);

        turma[0] = new Pessoa("12345678");
        turma[1] = new Pessoa("32323232", "João");
        turma[2] = new Pessoa("11111111");

        turma[2].setNome("Maria Joaquina");

        for(int i=0; i<turma.length;i++){
            System.out.println("Digite a nota do aluno "+turma[i].getNome());
            turma[i].setNota(ent.nextInt());
        }

        System.out.println("Conceito dos alunos: ");
        for (Pessoa x : turma) {
            System.out.println(x.getNome()+" tem conceito "+x.rendimento()+".");
        }

    }
}
