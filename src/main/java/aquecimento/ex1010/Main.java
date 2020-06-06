package main.java.aquecimento.ex1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", main.calculoSimples()));
    }

    public Double calculoSimples(){
        Double total = 0.0;
        Scanner scanner = new Scanner(System.in);

        for (Integer i=1; i<=2; i++){
            Integer codigo = scanner.nextInt();
            Integer quantidade = scanner.nextInt();
            Double valor = scanner.nextDouble();
            total = total + (valor * quantidade);
        }
        return total;
    }
}
