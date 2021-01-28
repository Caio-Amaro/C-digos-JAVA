
import java.util.Scanner;


public class retangulo {

    public static void main(String[] args) {
        
        Scanner entra = new Scanner(System.in);
        
        double ar, per;
        
        NewClass entre = new NewClass();
        
        entre.entrada();
        
        ar = entre.calcularArea();
        entre.exibe(ar);
        
        per = entre.calcularPerimetro();
        entre.exibePeri(per);
        
        
        
        
        
    }
    
}
