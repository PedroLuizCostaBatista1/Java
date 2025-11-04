import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número para começar a contagem regressiva: ");
        numero = entrada.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        entrada.close();
    }
}