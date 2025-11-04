import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.print("Digite um número para ver seu fatorial: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}