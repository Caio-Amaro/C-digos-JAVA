
import java.util.Scanner;

public class ExercCondicionais {

    public static void main(String[] args) {
        
        
       Scanner tet = new Scanner(System.in); 
       
       int x, y, w, result, result2;
       
       /*System.out.println(" Entre com o primeiro valor : ");
       x = tet.nextInt();
       
       System.out.println(" Entre com o segundo valor : ");
       y = tet.nextInt();
       
       result = x % y;
       
       if (result == 0) {
        
        System.out.println("os números são MULTIPLOS ");
       
       } else { System.out.println("os números NÃO são MULTIPLOS");
       
       }
       
       
       if (x > 0) System.out.println("O valor de X é um número POSITIVO");
       else System.out.println("O valor de X é um número NEGATIVO");
       
       
            
        if (y % 2 == 0) System.out.println ("o Valor de Y é um número Par");
        else System.out.println("O valor de Y é número é ìmpar");
        
        
        //////////////////////////////////////*/
        
        
       /*System.out.println(" Entre com o primeiro valor : ");
       w = tet.nextInt();
       
       if ( w > 100 ) 
       
       { 
           w -= 100;
           w *= 2;
           result2 = w + 50;
           System.out.println(" O valor a ser pago é de R$ " + result2);
       
       } else{ System.out.println("O valor a ser pago é de R$ 50,00");} 
       
       
       /////////////////////////////////////////////*/
       
       System.out.println("Entre com o valor de 1 a 7 ");
       x = tet.nextInt();
       
       String dia;
       
       switch (x){
       
       case 1:
            dia = "Domingo";
            break;
       
       case 2:
            dia = "Segunda-Feira";
            break;
        
       case 3:
            dia = "Terça-Feira";
            break;
       
       case 4:
            dia = "Quarta-Feira";
            break;
       
       case 5:
            dia = "Quinta-Feira";
            break;
       
       case 6:
            dia = "Sexta-Feira";
            break;
       
       case 7:
           dia = "Sábado";
           break;
       
       default :
          dia = "Esse valor não existe. Tente novamente";
          break;
       
    }
       
      // expressãso ternária
       
      System.out.println(" Hoje é " + dia);
        
      double prec = 40;
      double desconto;
      int desc = 1030;
      
            
       desconto = (prec > 60) ? prec * 100 : prec * 10;
              
       System.out.println("O valor é " + desconto);
       
       desc *= -1;
       
              
       System.out.println("O valor é " + desc);
       
    }
    
    
    
    
    
    
    

}

