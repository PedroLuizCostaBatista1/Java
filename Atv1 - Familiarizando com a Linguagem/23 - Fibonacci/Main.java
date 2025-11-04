import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;
        int proximoNumero;
        int a = 0;
        int b = 1;

        System.out.print("Digite um número: ");
        limite = entrada.nextInt();

        if (limite == 1) {
            System.out.println("0");
            entrada.close();
            return;
        }

        System.out.print(a + " " + b);

        for (int i = 2; i < limite; i++) {
            proximoNumero = a + b;
            System.out.print(" " + proximoNumero);

            a = b;
            b = proximoNumero;
        }

        System.out.println();

        entrada.close();
    }
}