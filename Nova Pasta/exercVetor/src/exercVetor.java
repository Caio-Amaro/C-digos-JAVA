
import entidades.controe;
import java.util.Locale;
import java.util.Scanner;


public class exercVetor {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entra = new Scanner(System.in);
        
        System.out.println (" Quantos Produtos Serão Cadastrados ? :");
        int n = entra.nextInt();
        
        System.out.println (" OK...serão cadastrados " + n + " produtos no sistema " );
        System.out.println (" ==========================================================");
        
        controe[] vect = new controe[n];
        
        for (int i = 0; i < vect.length; i++)
        {
            entra.nextLine();
            System.out.print(" NOME DO PRODUTO :");
            String name = entra.nextLine();
            System.out.print(" PREÇO DO PRODUTO :");
            double price = entra.nextDouble();
            vect[i] = new controe(name, price);
             System.out.println (" ==========================================================");
        
        }
        
        double sum = 0.0;
        
        for (int i = 0; i < vect.length; i++) 
        {
            
            sum += vect[i].getPreco();
        
        
        }
        
        double avg = sum / n;
        
        System.out.printf( " A média de preço é R$ = %.2f%n ", avg);
        
        
        for (int i = 0; i < vect.length; i++)
        {
            
            System.out.println(" Produto : " + vect[i].getNome() + " === Preço : R$ " + vect[i].getPreco());
        
        }
        
    }
    
}
