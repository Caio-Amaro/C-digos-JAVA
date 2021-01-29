
package funcoesmetodos;

import java.util.Scanner;

public class FuncoesMetodos {

    public static void main(String[] args) {
     
        
        Scanner ttd = new Scanner(System.in);
        int a, b, c, teste;
        
        a = ttd.nextInt();
        b = ttd.nextInt();
        c = ttd.nextInt();
        
        teste = max(a, b, c);
        
        show(teste);
        
        //System.out.println(" O maior valor é : " + x);
        
    }
    
    
    public static int max(int x, int y, int n)
    
    {
    
       int aux = 0;
       
       if (x < y) {
       
           aux = y;
           y = x;
           x = aux;
       
       }
       
       if (x < n) {
       
           aux = n;
           n = x;
           x = aux;
       
       }
       
       return x;
    
    }
    
    
    public static void show(int valor)
    {
    
        System.out.println(" O maior valor é : " + valor);
    
    
    }
    
}
