import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, potencia;
        int resultado = 1;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        System.out.print("Digite a potencia: ");
        potencia = entrada.nextInt();

        for (int i = 0; i < potencia; i++) {
            resultado *= numero;
        }

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}