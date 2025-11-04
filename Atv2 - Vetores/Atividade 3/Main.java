import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double [] notas = new double[5];
		double nota;
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
		    System.out.printf("Digite a %d° nota: ", i + 1);
		    nota = entrada.nextDouble();
		    notas[i] = nota;
		}
		
		for (double valor: notas) {
		    media += valor;
		}
		
		media /= notas.length;
		
		System.out.printf("Media total: %.2f\n", media);
		
		entrada.close();
	}
}