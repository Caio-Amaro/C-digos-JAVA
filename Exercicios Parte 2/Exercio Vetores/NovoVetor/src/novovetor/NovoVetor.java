
package novovetor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ONG
 */
public class NovoVetor {

    
    public static void main(String[] args) {
    
        
        Locale.setDefault(Locale.US);

        Scanner qt = new Scanner(System.in);
       
        
        int soma;
        soma = qt.nextInt();
        double []vect = new double [soma];
        
       
        
        
        for (int i = 0; i <= soma; i++)
        
        {
            
            vect[i] = qt.nextDouble();
  
        }
        
        double sum = 0.0;
        
        for (int i = 0; i < soma; i++) 
        
        {
            sum+= vect[i];
            
        }
        
        double media = sum / soma;
        
        System.out.println(" Opa " + media);

        
    }
    
}
