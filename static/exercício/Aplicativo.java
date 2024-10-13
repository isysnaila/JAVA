public class Aplicativo {
    public static void main(String[] args) {
      
       Fornecedor forne1 = new Fornecedor("Fornecedor 1", "1111111/000","fornecedor1@gmail.com");
       Fornecedor forne2 = new Fornecedor("Fornecedor 2", "2222222/000","fornecedor2@gmail.com");

       Produto prod1 = new Produto("Celular", 2500, 0, forne1);
       Produto prod2 = new Produto("Tablet", 1550,0, forne2);

       prod1.ajusteQuant(51);
       prod1.ajusteQuant(-2);
       prod1.ajusteQuant(-65);

       System.out.println("___________________________________________________________________________________");

       prod2.ajusteQuant(20);
       prod2.ajusteQuant(25);
       prod2.ajusteQuant(-5);

       System.out.println("___________________________________________________________________________________");

       System.out.println("O valor total do "+ prod1.getNome() + " que temos em estoque em dólar é: " + Conversor.convertDolar(prod1,5));
       System.out.println("O valor total do "+ prod2.getNome() + " que temos em estoque em dólar é: " + Conversor.convertDolar(prod2,5));

       System.out.println("___________________________________________________________________________________");

       System.out.println(Conversor.valorDesconto(prod1,15));
       System.out.println(Conversor.valorDesconto(prod2,50));

       System.out.println("___________________________________________________________________________________");


        

    
    }
}
