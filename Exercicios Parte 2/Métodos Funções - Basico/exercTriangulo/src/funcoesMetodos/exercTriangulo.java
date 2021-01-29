
package funcoesMetodos;


import java.util.Scanner;


public class exercTriangulo {

    
    public static void main(String[] args) {
        
        
            
        Scanner tetc = new Scanner(System.in);
        
        double result, result1 ;
        
        Triangulo volta, volta1;
        
        volta = new Triangulo();
        volta1 = new Triangulo();
        
        System.out.println(" Entre com os lados do triângulo de X ");
        volta.a  = tetc.nextDouble();
        volta.b = tetc.nextDouble();
        volta.c = tetc.nextDouble();          
        result = volta.trianCalculo();
        
       
        
        System.out.println(" Entre com os lados do triângulo de Y ");
        volta1.a = tetc.nextDouble();
        volta1.b = tetc.nextDouble();
        volta1.c = tetc.nextDouble();
        result1 = volta1.trianCalculo();
        
        Triangulo.exibeResultado(result, result1);
               
    }
    
        
    
    
       
}
