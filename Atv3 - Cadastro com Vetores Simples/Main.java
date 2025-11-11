import java.util.Scanner;
import libs.Produto;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Produto maior = new Produto("", 0);
		Produto [] produtos;
		
		String nome;
		double preco;
		int quantidade;
		
		System.out.print("Quantos produtos deseja cadastrar? ");
		quantidade = entrada.nextInt();
		produtos = new Produto[quantidade];
		
		entrada.nextLine();
		
		for (int i = 0; i < produtos.length; i++) {
		    System.out.println("Produto " + (i + 1));
		    System.out.print("Nome: ");
		    nome = entrada.nextLine();
		    
		    System.out.print("Preço: R$");
		    preco = entrada.nextDouble();
		    
		    produtos[i] = new Produto(nome, preco);
		    
		    entrada.nextLine();
		    System.out.println();
		}
		
		System.out.println("--- Produtos Cadastrados ---");
		
		for (Produto produto: produtos) {
		    produto.exibirInformacoes();
		    
		    if (produto.getPreco() > maior.getPreco()) {
		        maior = produto;
		    }
		    
		    System.out.println();
		}
		
		System.out.println("--- Produto mais caro ---");
		maior.exibirInformacoes();
		
		entrada.close();
	}
}