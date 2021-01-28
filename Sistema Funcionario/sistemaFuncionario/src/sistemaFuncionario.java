
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilitario.Calculo;


public class sistemaFuncionario {


    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        List<Calculo> lista = new ArrayList();
        
        
              
        
        System.out.println("==============================================");
        
        System.out.println(" SISTEM CAIO OLHINHO - CADASTRO DE FUNCIONÁRIO");
        
        System.out.println("==============================================");
        
        System.out.print(" Entre com a quantidade de funcionários :");
        int aux = entrada.nextInt();
        
        for (int i = 0; i < aux; i++)
        {
            entrada.nextLine();
            
            System.out.println(" FUNCIONÁRIO N° " + i+1);
            System.out.println("******************************************");
            
            System.out.print("Entre com ID do Fun1cionário : ");
            Integer aux1 = entrada.nextInt();
                       
            System.out.print("Entre com o nome do Funcionário : ");
            entrada.nextLine();
            String nomeAux = entrada.nextLine();
                        
            System.out.print("Entre com o salário do funcionário :");            
            Double aux2 = entrada.nextDouble();
            
            Calculo entre = new Calculo(aux1, nomeAux, aux2);
            
            lista.add(entre);
            
            
        }
        
        System.out.print("Entre com o ID do funcionário : ");
        int entreSalario = entrada.nextInt();
        Integer pos = hasId(lista, entreSalario);
        
        if (pos == null)
        {
            
            System.out.println(" Esse ID não existe ! ");
        
        }
        
        else 
        {
            System.out.print(" Qual a porcentagem ? : ");
            double porcentagem = entrada.nextDouble();
            lista.get(pos).calcularSalario(porcentagem);
        }
        
        
        System.out.println();
        System.out.println(" Lista de Funcionários ");
        
        for (Calculo emp : lista)
        {
        
            System.out.println(emp);
        
        }
        
        
        
      
        
    }
    
    
    public static Integer hasId(List<Calculo> list, int id)
    {
        for (int i = 0; i < list.size(); i++) 
        
        {
            if (list.get(i).getId() == id)
            
            {
            
                return i;
            
            }
            
                   
        }
        return null;
    
    
    
    }
    
}
