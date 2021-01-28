
import java.util.Scanner;


public class NewClass {
    
    Scanner entra = new Scanner(System.in);
    
    public double altura;
    public double largura;
    
    
    public void exibe (double area) 
    {
    
        if (this.altura == this.largura) 
        {
            
            System.out.println(" A área do quadrado é : " + area);
        
        } else {System.out.println(" A área do retangulo é : " + area);}
    
    }
    
    public void exibePeri (double peri) 
    {
    
        if (this.altura == this.largura) 
        {
            
            System.out.println(" O perimetro do quadrado é : " + peri);
        
        } else {System.out.println(" O perimetro do retangulo é : " + peri);}
    
    }
    
    
    public void entrada ()
    
    {
    
        System.out.println(" Qual a altura : ");
        this.altura = entra.nextDouble();
        
         System.out.println(" Qual a largura : ");
        this.largura = entra.nextDouble();
    
    
    }
    
    public double calcularArea()
    
    {
        double area;
        
        area = this.altura * this.largura;
        
        return area;
    }
    
    public double calcularPerimetro()
    {
        
        double peri;
        peri = 2*this.altura + 2*this.largura;
        return peri;
    
    }
    
    public double calcularDiagonal()
    {
    
        return 0;
    
    }
    
}
