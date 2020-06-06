package main.java.aquecimento.ex1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("DIFERENCA = " + main.diferenciar());
    }

    public Integer diferenciar(){
        Integer diferenca;
        Integer a, b, c, d;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        diferenca = (a * b - c * d);

        return diferenca;
    }
}
