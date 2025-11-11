public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirInformacoes() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Preço: R$%.2f\n", this.preco);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
} 