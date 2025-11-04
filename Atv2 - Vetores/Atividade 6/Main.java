import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[8];
		int numero;

		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		System.out.println("Vetor invertido");
		
		for (int i = numeros.length - 1; i >= 0; i--) {
		    System.out.print(numeros[i] + " ");
		}
		
		
		entrada.close();
	}
}