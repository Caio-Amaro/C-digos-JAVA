
package exerrepeticao2;

import java.util.Scanner;


public class ExerRepeticao2 {

    public static void main(String[] args) {

        Scanner ttc = new Scanner(System.in);
        
        int x, i, y, soma;
        
        x = 0;
        y = 0;
        soma = 0;
        
        System.out.println(" Diga quantos valores você quer somar : ");
        x = ttc.nextInt();
        
        System.out.println(" Agora entre com os valores da soma : ");
        
        for (i = 0; i < x; i++) {
        
            soma += y;
            y = ttc.nextInt();
            
        
        
        }
        
        System.out.println("O valor da soma é : " + soma);
        
        
        
        
    }
    
}
