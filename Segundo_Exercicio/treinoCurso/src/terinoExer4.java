
import java.util.Locale;
import java.util.Scanner;


public class terinoExer4 {

    public static void main(String[] args) {
       
         Locale.setDefault(Locale.US);
    
    Scanner tet = new Scanner(System.in);
    
  
    int hora = 0; 
    int id = 0;
    double salario = 0.0000;
    double saida;
    
    System.out.println("Exercicio calculo de salário : ");
    
    System.out.println("Qual o código do Funcionário : ");
    id = tet.nextInt();
    
    System.out.println("Quantas horas o funcionário trabalhou : ");
    hora = tet.nextInt();
    
    System.out.println("Qual o valor da hora de trabalho : ");
    salario = tet.nextFloat();
    
    System.out.println("ID do Funcionário : " + id);
    System.out.println("Horas trabalhadas : " + hora);
    System.out.println("Valor da hora     : R$ " + salario);
    
    
    saida = hora * salario;
    
    System.out.printf("O valor de saida é %.4f%n", saida);
        
        
    }
    
}
