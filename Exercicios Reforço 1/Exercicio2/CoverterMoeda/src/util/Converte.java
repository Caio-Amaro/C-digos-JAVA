
package util;

import java.util.Scanner;


public class Converte {
    
    Scanner entra = new Scanner(System.in);
    
    public final double DOLAR = 5.56;
    public double real;
    public double qtd;
    
    
    
    
    public void entrada()
    {
        
        
        System.out.println(" Quantos dolares você quer comprar ? ::");
        this.qtd = entra.nextDouble();
        
           
    
    }
    
    public double converte ()
    {
    
        this.real = this.qtd * DOLAR;
        this.real = this.real / 100 * 94;
        return this.real;
    
    }
    
    public void exibe ()
    {
    
        System.out.println(" O valor com desconto de IOF é de R$ : " + this.real);
    
    }
    
    
}
