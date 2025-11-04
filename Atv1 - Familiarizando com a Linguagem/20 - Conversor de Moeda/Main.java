import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, resultado;
        int opcao;

        System.out.println("Seleciona uma das opções abaixo");
        System.out.println();

        System.out.println("[ 1 ] - Converter real para dolar");
        System.out.println("[ 2 ] - Converter real para euro");
        System.out.println();

        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        System.out.println();

        switch (opcao) {
            case 1: {
                System.out.print("Digite um valor R$");
                valor = entrada.nextDouble();
                resultado = valor / 5.40;

                System.out.printf("Resultado: R$%.2f -> $%.2f\n", valor, resultado);
                break;
            }

            case 2: {
                System.out.print("Digite um valor R$");
                valor = entrada.nextDouble();
                resultado = valor / 6.22;

                System.out.printf("Resultado: R$%.2f -> £%.2f\n", valor, resultado);
                break;
            }

            default: {
                System.out.println("Opção invalida. Tente novamente.");
            }
        }

        entrada.close();
    }
}