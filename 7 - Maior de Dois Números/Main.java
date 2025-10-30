import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número " + numero1 + " é o maior.");
        } else {
            System.out.println("O segundo número " + numero2 + " é o maior.");
        }

        entrada.close();
    }
}