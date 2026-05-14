package sistema;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto (String nome, double preco, int quantidadeEstoque)
    {
        if (nome.isEmpty() || preco < 0 || quantidadeEstoque < 0)
        {
            System.err.print("Valor(es) Inválido(s)");
            return;
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public double valorTotalEstoque ()
    {
        return this.preco * this.quantidadeEstoque;
    }
    
    public boolean disponivel ()
    {
        return quantidadeEstoque > 0;
    }
}
