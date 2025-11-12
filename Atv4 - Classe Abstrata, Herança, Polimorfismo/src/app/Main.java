package app;

import utils.*;

public class Main {
    public static void main(String[] args) {
        Gerente [] gerentes = {
            new Gerente("Cesar", 100, 5),
            new Gerente("Antonio", 1250, 250),
        };

        Desenvolvedor [] desenvolvedores = {
            new Desenvolvedor("Paulo", 2275, 3),
            new Desenvolvedor("Heitor", 3325, 5)
        };

        System.out.println("--- Gerentes --- ");

        for (Gerente gerente: gerentes) {
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Cargo: Gerente");
            System.out.println("Salário: R$" + gerente.calcularSalario());
            System.out.println();
        }

        System.out.println("--- Desenvolvedores --- ");
        System.out.println();

        for (Desenvolvedor desenvolvedor: desenvolvedores) {
            System.out.println("Nome: " + desenvolvedor.getNome());
            System.out.println("Cargo: Desenvolvedor");
            System.out.println("Salário: R$" + desenvolvedor.calcularSalario());
            System.out.println();
        }
    }
}
