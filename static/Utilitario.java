public class Utilitario {
   
    public static boolean ehPar(int num){
        return num%2==0;
    }

    public static boolean ehImpar(int num){
        return num%2!=0;
    }

    public static boolean ehPrimo(int num){
        int divisores=0;
        for(int i=num; i>=1;i--){
            if (num%i==0) divisores++;
                    
            
        }
        return (divisores==2?true:false);
    }
}
