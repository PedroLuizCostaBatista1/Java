import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] notas = {100, 50, 20, 10, 5};
        int valor;

        System.out.print("Digite um valor para sacar R$");
        valor = entrada.nextInt();

        for (int nota: notas) {
            System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
            valor %= nota;
        }

        entrada.close();
    }
}