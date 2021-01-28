
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class matrizes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> entre = new ArrayList();
        
        System.out.println( " EXERCICIO MATRIZES - CAIO OLHINHO ");
        System.out.println( " ==============================================");
        System.out.println( " Entre com o valor da matriz ");
        
        int aux = entrada.nextInt();
        int aux1 = aux;
        int cont = 0;
        int matriz[][] = new int[aux][aux1];
        int vect[] = new int [aux];
        //int vect1[] = new int [aux*aux];
        
        int matrizAux[][] = new int[aux][aux1];
        
        
        for (int i = 0; i < aux; i++)
        {
            
            for (int j = 0; j < aux1; j++ )
            {
                
                System.out.print(" Entre com os Valores da Matriz : ");
                matriz[i][j] = entrada.nextInt();
                
                if (matriz[i][j] < 0 )
                        
                {
                cont += 1;
                entre.add(matriz[i][j]);
                
                
                }
                            
            }
        
        
        }
        
        for ( int i = 0; i < aux; i++)
        {
            System.out.println();
            
            for ( int j = 0; j < aux1; j++)
                
            {
                
                                
                System.out.print(matriz[i][j] + " | ");
                
            }
        
        }
        
        System.out.println();
        System.out.println(" ----------------------- ");
        System.out.println(" OS NÚMEROS DA DIAGONAL ");
        System.out.println(" ----------------------- ");
        
        for ( int i = 0; i < aux; i++)
        {
            for (int j = 0; j < aux1; j++)
            {
            
                if (i == j) 
                {
                    
                    vect[i] = matriz[i][j];
                
                }
            
            }
            
        }
        
        for (int i = 0; i < vect.length; i++){
        System.out.print( vect[i] + " -- ");
        }
        
        System.out.println();
        System.out.println(" ----------------------- ");
        System.out.println(" IDENTIFICANDO OS NEGATIVOS ");
        System.out.println(" ----------------------- ");
        
        System.out.println(" O número de negativos são : " + cont);
        System.out.println(" ----------------------- ");
        System.out.println(" ----------------------- ");
        
        
        for (Integer emp : entre )
        {
            int i = 0;
            System.out.println( " Valor " + emp.toString());
            
        
        }
        
        
    }
    
}
