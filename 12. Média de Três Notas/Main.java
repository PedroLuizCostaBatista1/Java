import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota, media;
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite a %d° nota do aluno(a): ", i);
            nota = entrada.nextDouble();
            soma += nota;
        }

        media = soma / 3;

        System.out.printf("Media do aluno(a): %.2f\n", media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reaprovado");
        }

        entrada.close();
    }
}