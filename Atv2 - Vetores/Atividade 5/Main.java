import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int pares = 0;
		int impares = 0;
		int numero;

		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Digite o %d° número: ", i + 1);
		    numero = entrada.nextInt();
		    numeros[i] = numero;
		}
		
		for (int valor: numeros) {
		    if (valor % 2 == 0) {
		        pares++;
		    } else {
		        impares++;
		    }
		}
		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números impares:  " + impares);
		
		entrada.close();
	}
}