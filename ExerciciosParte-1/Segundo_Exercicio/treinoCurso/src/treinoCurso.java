
import java.util.Locale;
import java.util.Scanner;
import java.math.*;


public class treinoCurso {

    
    public static void main(String[] args) {
     
    Locale.setDefault(Locale.US);
    
    Scanner tet = new Scanner(System.in);
    
    
    double entrada;
    double saida;
    
    System.out.println("Entre com os valor para calcular o raio : ");
    
    entrada = tet.nextFloat();
    
    saida = Math.pow(entrada, 2) * Math.PI;
    
       
    System.out.printf("O valor de saida é %.4f%n", saida);
    
    
    
    
    
    
        

    }
    
}
