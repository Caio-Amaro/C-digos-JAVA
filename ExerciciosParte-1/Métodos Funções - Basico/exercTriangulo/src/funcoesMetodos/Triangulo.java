
package funcoesMetodos;


public class Triangulo {
    
    public double a;
    public double b;
    public double c;
    
    
    
     
    
    public double trianCalculo () 
    {
    
       double p, area;
       
       p = (this.a + this.b + this.c) / 2;
       area = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
       
       return area;
    
    }
    
    
    public static void exibeResultado(double valor1, double valor2 )
    {
        
        System.out.println(" A área do triângulo X é : " + valor1);
        System.out.println(" A área do triângulo Y é : " + valor2);
    
        if (valor1 > valor2) 
            System.out.println("O triângulo X tem uma área maior no valor de " + valor1);
        
        else 
            System.out.println("O triângulo Y tem uma área maior no valor de " + valor2);
        
    
    
    }
    
}

