import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números abaixo");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor: ");
            numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println();

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        entrada.close();
    }
}