import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos números pares: " + soma);

        entrada.close();
    }
}