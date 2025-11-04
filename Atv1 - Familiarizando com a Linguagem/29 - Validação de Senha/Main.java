import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;

        System.out.println("Digite uma senha entre 6 caracteres a 20 caracteres");

        while (true) {
            System.out.print("Senha: ");
            senha = entrada.next();

            if (senha.length() > 6 && senha.length() < 20) {
                System.out.println("Senha aceita com sucesso!");
                break;
            } else {
                System.out.println("Senha não aceita. Tente novamente");
            }
        }

        entrada.close();
    }
}