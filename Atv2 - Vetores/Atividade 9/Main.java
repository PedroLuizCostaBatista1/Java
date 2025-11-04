import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int numero;
		
		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		System.out.println("Números positivos: ");
		
		for (int valor: numeros) {
		    if (valor > 0) {
		        System.out.print(valor + " ");
		    }
		}
		
		entrada.close();
	}
}