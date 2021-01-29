
import java.util.Scanner;


public class Produtos {
    
    Scanner adc = new Scanner(System.in);
    
    public String nomeProduct;
    public double price;
    public int qtid;
    public double valorTotal;
    
    
    
    public void adicionar() 
    {
    
        System.out.print(" Adicione Nome do Produto : ");
        this.nomeProduct = adc.next();
        
        System.out.print(" Adicione Preço do Produto : ");
        this.price = adc.nextDouble();
        
        System.out.print(" Adicione Quantidade do Produto : ");
        this.qtid = adc.nextInt();
        
        quantidade();
     
    }
    
    public void exibir ()
    {
    
        System.out.println(" Nome do Produto : " + this.nomeProduct);
        System.out.println(" Preço do Produto R$ : " + String.format("%.2f", this.price));
        System.out.println(" Quantidade  : " + this.qtid);
        System.out.println(" Valor total do produto R$ : " + String.format("%.2f", this.valorTotal));
        
    
    
    }
    
    public double quantidade ()
    {
    
    this.valorTotal = this.price * this.qtid;
    return this.valorTotal;
    
    
    }
    
    public int adicionarQuantidade()
    {
        int entrada;
        
        System.out.print(" Adicione quantidade para dicionar no estoque : ");
        entrada = adc.nextInt();
                
        
        this.qtid += entrada;
        quantidade();
        return this.qtid;
    
    }
    
    public int removerQuantidade()
    {
    
        int saida;
        
        System.out.print(" Adicione quantidade para remover do estoque : ");
        saida = adc.nextInt();
                
        
        this.qtid -= saida;
        quantidade();
        return this.qtid;
        
    
    
    }
    
    @Override
    public String toString() 
    {
    
        return this.nomeProduct
               + ", R$"
               + String.format("%.2f", this.price)
               + ", "
               + this.qtid
               + " unidades, Total : R$ "
               + String.format("%.2f", this.valorTotal);

    
    }
    
    
}
