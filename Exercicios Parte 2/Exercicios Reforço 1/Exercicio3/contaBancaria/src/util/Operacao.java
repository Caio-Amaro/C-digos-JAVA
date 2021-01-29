
package util;

import java.util.Random;


        

public class Operacao {
    
    
    private int numeroConta;
    private String nomeCliente;
    private double saldoConta;
    private double saldoInicial;
        
    public Operacao(String nome, double saldoConta) {

        //this.numeroConta = conta;
        this.nomeCliente = nome;
        this.saldoConta = saldoConta;
        this.saldoInicial = 0;

}

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
    
    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    
    public void criarConta(String nome, double deposito)
    {
        Random random = new Random();
        int numero = random.nextInt(9999);
        
        setNumeroConta(numero);
        setNomeCliente(nome);
        setSaldoInicial(deposito);
        //efetuaDeposito(deposito);
                
        
    }
    
    public void exibirConta()
    {
        System.out.println(" NÚMERO DA CONTA .: " + getNumeroConta());
        System.out.println(" NOME DO CLIENTE .: " + getNomeCliente());
        System.out.println(" SALDO DA CONTA  .: " + getSaldoConta());
    
    
    }
    
    public void efetuaDeposito(double entrada)
    
    {
        double saldo;
        
       
        
        saldo = getSaldoConta() + entrada;
        setSaldoConta(saldo);
        
        
}
    
    public void efetuaSaque( double saida)
    {
        double saldo;
        
        saldo = getSaldoConta() - saida;
        
        if ( saldo < 0)
        {
        
            System.out.println(" Saldo Insuficiente para Saque. TENTE NOVAMENTE");
            saldo = getSaldoConta() + saida;
            
            
        } else {setSaldoConta(saldo);}
        
    
    }

    
    
    
    
    
}
