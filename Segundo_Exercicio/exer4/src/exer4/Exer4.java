
package exer4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ONG
 */
public class Exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               Locale.setDefault(Locale.US);
    
    Scanner tet = new Scanner(System.in);
    
  
    int hora = 0; 
    int id = 0;
    double salario = 0.0000;
    double saida = 0;
    
    System.out.println("Exercicio calculo de salário : ");
    
    System.out.println("Qual o código do Funcionário : ");
    id = tet.nextInt();
    
    System.out.println("Quantas horas o funcionário trabalhou : ");
    hora = tet.nextInt();
    
    System.out.println("Qual o valor da hora de trabalho : ");
    salario = tet.nextFloat();
    
    /*System.out.println("ID do Funcionário : " + id);
    System.out.println("Horas trabalhadas : " + hora);
    System.out.printf("Valor da hora  %.2f%n ", salario);
        
    saida = hora * salario;
    
    System.out.printf("O valor a receber é de R$ %.2f%n", saida);*/
    
    
    saida = hora * salario;
    System.out.println(" NUMBER : " + id);
    System.out.printf("SALARY : U$ %.2f%n", saida);
        
    }
    
}
