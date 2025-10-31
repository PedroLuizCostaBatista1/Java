import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroUsuario;
        int numeroComputador = random.nextInt(1, 11);
        int tentativas = 1;

        System.out.println("Eu escolhi um número entre 1 a 10");
        System.out.println("Qual número eu escolhi?");

        do {
            System.out.println();

            System.out.print("Valor: ");
            numeroUsuario = entrada.nextInt();

            if (numeroUsuario > numeroComputador) {
                System.out.println("O valor foi alto. Tente novamente.");
            } else if (numeroUsuario < numeroComputador) {
                System.out.println("O valor foi baixo. Tente novamente.");
            }

            tentativas++;
        } while (numeroComputador != numeroUsuario);

        System.out.println("Parabens! Você advinhou o número com " + tentativas + " tentativa(s)");

        entrada.close();
    }
}