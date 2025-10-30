import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, resultado;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        resultado = numero1 + numero2;

        System.out.println("Resultado: " + resultado);
        
        entrada.close();
    }
}
