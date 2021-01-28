
import java.util.Scanner;


public class entradaProduto {

    public static void main(String[] args) {
        
        Scanner text = new Scanner(System.in);
        Produtos opa = new Produtos();
        
        System.out.println(" Entre com os dados do produto");
        
        opa.adicionar();
        
        //System.out.println(" DETALHES DO PRODUTO");
        opa.exibir();
        
        System.out.println("");
        opa.adicionarQuantidade();
        
        System.out.println("");
        System.out.println(" NOVOS DETALHES DO PRODUTO");
        //opa.exibir();
        
            
        opa.removerQuantidade();
        
        System.out.println("");
        System.out.println(" RESULTADO FINAL DO ESTOQUE DO PRODUTO");
        //opa.exibir();
        
        
        System.out.println("");
        System.out.println(opa);
        
        
    }
    
   
    
}
