import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[5];
		int numero;
		
		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		System.out.println("Valores dentro do vetor:");
		
		for (int valor: numeros) {
		    System.out.print(valor + " ");
		}
		
		
		entrada.close();
	}
}