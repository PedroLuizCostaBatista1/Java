import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println("Resultados");
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão: " + (numero1 / numero2));

        entrada.close();
    }
}