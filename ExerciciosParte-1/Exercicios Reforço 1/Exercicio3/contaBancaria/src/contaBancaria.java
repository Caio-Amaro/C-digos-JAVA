
import java.util.Scanner;
import util.Operacao;


public class contaBancaria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String nome;
        double saldoConta = 0; 
        //int saldoInicial;
        double valor;
        
        System.out.println( " BANCO CAIO OLHINHO S/A -- ABERTURA DE CONTA ");
        System.out.println( " Entre com o nome cmpleto do cliente .: ");
        nome = entrada.nextLine();
        
        System.out.println( " Cliente realizará algum depósito ? [ s ou n ] : ");
        char saldoInicial = entrada.next().charAt(0);
        
            if (saldoInicial == 's' ) 
            {
                
                System.out.println(" Entre com o valor de depósito .: ");
                saldoConta = entrada.nextDouble();
                
            
            } else 
            
            {   
                System.out.println(" Sem depósito");
                saldoConta = 0.00;
            
            
            }
        
        
        Operacao teste = new Operacao(nome, saldoConta);
        
        teste.criarConta(nome, saldoConta);              
        teste.exibirConta();
        
        System.out.println( " ============================================================= ");
        System.out.println( " Quer Realizar um depósito ? Entre com valor de depósito .:");
        
        
        valor = entrada.nextDouble();
        teste.efetuaDeposito(valor);
        teste.exibirConta();
        
        System.out.println( " ============================================================= ");
        
        System.out.println( " Quer Realizar um saque ? Entre com valor de depósito .:");
        
        valor = entrada.nextDouble();
        teste.efetuaSaque(valor);
        teste.exibirConta();
   
    
        
    
    }
    
}
