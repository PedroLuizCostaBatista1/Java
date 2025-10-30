import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        System.out.print("Digite um número para contar seus pares e impares: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        entrada.close();
    }
}