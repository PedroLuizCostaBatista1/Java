import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número para ver sua tabela: ");
        numero = entrada.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", numero, i, numero * i);
        }

        entrada.close();
    }
}