
package utilitario;

public class Calculo {
    
    private Integer id;
    private String nome;
    private Double salario;
    
    
    public Calculo( Integer id, String nome, Double salario)
    {
    
        this.id = id;
        this.nome = nome;
        this.salario = salario;
            
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    public double calcularSalario(double porcentagem)
    {
        this.salario += this.salario * porcentagem / 100; 
        
        return this.salario;
        
        
    
    }
    
    @Override
    public String toString()
    {
        
        return this.id + " , " + this.nome + " , " + String.format("%.2f", this.salario);
    
    }
    
    
}
