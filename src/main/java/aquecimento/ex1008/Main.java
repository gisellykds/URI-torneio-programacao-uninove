package main.java.aquecimento.ex1008;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.salario();
    }

    public void salario(){
        Integer numero;
        Integer numeroHoras;
        Double valorHoras;
        Double salario;

        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();
        numeroHoras = scanner.nextInt();
        valorHoras = scanner.nextDouble();
        salario = numeroHoras * valorHoras;

        System.out.println("NUMBER = " + numero);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
