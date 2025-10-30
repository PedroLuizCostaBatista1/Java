import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        int soma = 0;

        System.out.print("Digite um número: ");
        valor = entrada.nextInt();

        for (int i = 1; i <= valor; i++) {
            soma += valor;
        }

        System.out.println("Resultado: " + soma);

        entrada.close();
    }
}