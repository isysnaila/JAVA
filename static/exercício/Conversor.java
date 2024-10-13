public class Conversor {
    public static double convertDolar(Produto produto, double taxaCambio){
        return produto.valorTotal()/taxaCambio;
    } 

    public static String valorDesconto(Produto produto, int desconto){
        double precoDesconto = produto.getPreco()-produto.getPreco()*desconto/100;
        return "O valor do "+produto.getNome() + " com desconto de "+ desconto +"% é: R$" + precoDesconto;
       
    }

}
