import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança");
        } else if (idade > 12 && idade <= 18) {
            System.out.println("Você é um adolescente");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }

        entrada.close();
    }
}