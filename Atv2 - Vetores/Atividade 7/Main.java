import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] nomes = new String[10];
		String nome;
		boolean nomeEncontrado = false;
		
		for (int i = 0; i < nomes.length; i++) {
		    System.out.printf("Digite o %d° nome: ", i + 1);
		    nome = entrada.nextLine();
		    nomes[i] = nome;
		}
		
		System.out.print("Digite um nome para buscar na lista: ");
		nome = entrada.nextLine();
		
		for (String valor: nomes) {
		    nomeEncontrado = false;
		    
		    if (valor.contains(nome)) {
		        nomeEncontrado = true;
		        break;
		    }
		}
		
		if (nomeEncontrado) {
		    System.out.println("O nome esta presente na lista");
		} else {
		    System.out.println("O nome não esta presente na lista");
		}
		
		entrada.close();
	}
}