package main.java.aquecimento.ex1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("PROD = " + main.produto());
    }

    public Integer produto(){
        Integer valor1;
        Integer valor2;
        Integer PROD;

        Scanner scanner = new Scanner(System.in);
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        PROD = (valor1 * valor2); //o valor da multiplicacao de 2 numeros é dada como produto

        return PROD;
    }
}
