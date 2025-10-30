import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean ePrimo = true;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        if (numero <= 1) {
            ePrimo = false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ePrimo = false;
            }
        }

        if (ePrimo) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }

        entrada.close();
    }
}