import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		int numero;

		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		for (int valor: numeros) {
		    if (valor > maior) {
		        maior = valor;
		    }
		    
		    if (valor < menor) {
		        menor = valor;
		    }
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		entrada.close();
	}
}