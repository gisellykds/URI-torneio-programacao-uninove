package main.java.aquecimento.ex1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(String.format("TOTAL = R$ %.2f", main.salarioTotal()));
    }

    public Double salarioTotal(){
        Double salario, montante, comissao, total;
        String nome;

        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        salario = scanner.nextDouble();
        montante = scanner.nextDouble();

        total = salario + (montante * 0.15);

        return total;

    }
}
