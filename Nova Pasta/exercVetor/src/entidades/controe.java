
package entidades;

public class controe {
    
    private String nome;
    private double preco;
    
    public controe(String name, double price){
    
        this.nome = name;
        this.preco = price;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
