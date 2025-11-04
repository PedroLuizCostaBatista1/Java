import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, resultado;
        char operacao;

        System.out.println("Qual temperatura deseja converter?");
        System.out.println();

        System.out.println("[ F ] - Converter a temperatura para Fahrenheit");
        System.out.println("[ K ] - Converter a temperatura para Kelvin");
        System.out.println();

        System.out.print("Valor: ");
        operacao = entrada.next().toUpperCase().charAt(0);

        switch (operacao) {
            case 'F': {
                System.out.print("Digite a temperatura: ");
                valor = entrada.nextDouble();

                resultado = (valor * 9 / 5) + 32;
                System.out.printf("Resultado: %.1f °C -> %.1f °F\n", valor, resultado);
                break;
            }

            case 'K': {
                System.out.print("Digite a temperatura: ");
                valor = entrada.nextDouble();

                resultado = valor + 273.15;
                System.out.printf("Resultado: %.1f °C -> %.1f °K\n", valor, resultado);
                break;
            }

            default: {
                System.out.println("Valor invalido. Tente novamente");
            }
        }

        entrada.close();
    }
}