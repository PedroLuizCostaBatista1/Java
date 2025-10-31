import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        if (numero == soma) {
            System.out.println("O número é perfeito");
        } else {
            System.out.println("O número não é perfeito");
        }

        entrada.close();
    }
}