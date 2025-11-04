import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[5];
		int numero;
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		for (int valor: numeros) {
		    soma += valor;
		}
		
		System.out.println("A soma total do vetor é " + soma);
		
		
		entrada.close();
	}
}