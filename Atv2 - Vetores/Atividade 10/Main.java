import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor1 = new int[5];
		int [] vetor2 = new int[5];
		int [] total = new int[10];
		int numero;
		
		for (int i = 0; i < vetor1.length; i++) {
		    System.out.printf("Digite o %d° número do primeiro vetor: ", i + 1);
		    numero = entrada.nextInt();
		    vetor1[i] = numero;
		    total[i] = numero;
		}
		
		for (int i = 0; i < vetor2.length; i++) {
		    System.out.printf("Digite o %d° número do segundo vetor: ", i + 1);
		    numero = entrada.nextInt();
		    vetor2[i] = numero;
		    total[i + 5] = numero;
		}
		
	    System.out.println("Vetor com os dois vetores juntos: ");
		
		for (int valor: total) {
		    System.out.print(valor + " ");
		}
		
		
		entrada.close();
	}
}