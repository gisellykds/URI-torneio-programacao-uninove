package main.java.aquecimento.ex1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(String.format("MEDIA = %.1f", main.media2()));
    }

    public Double media2(){
        Double notaA ;
        Double notaB;
        Double notaC;
        Double media;

        Scanner scanner = new Scanner(System.in);
        notaA = scanner.nextDouble();
        notaB = scanner.nextDouble();
        notaC = scanner.nextDouble();

        notaA = (notaA * 2.0);
        notaB = (notaB * 3.0);
        notaC = (notaC * 5.0);

        media = ((notaA + notaB + notaC) / 10);

        return media;
    }
}
