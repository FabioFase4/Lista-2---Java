package sistema;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String nome;
       double preco;
       int quant;
       
       System.out.print("Tem-Se um Produto");
       System.out.print("\nDigite o Nome: ");
       nome = sc.nextLine();
       
       System.out.print("\nDigite o Preço: ");
       preco = sc.nextDouble();
       
       System.out.print("\nDigite a Quantidade em Estoque: ");
       quant = sc.nextInt();
       
       
       Produto produto = new Produto(nome, preco, quant);
       
       double valorTotal = produto.valorTotalEstoque();
       boolean disponivel = produto.disponivel();
       
       System.out.print("\n\nInformações do Produto");
       System.out.print("\nValor Total: " + valorTotal);
       System.out.println("\nDisponível: " + (disponivel ? "Sim" : "Não"));
    }
    
}
