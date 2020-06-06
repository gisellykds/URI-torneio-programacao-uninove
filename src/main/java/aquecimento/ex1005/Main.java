package main.java.aquecimento.ex1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(String.format("MEDIA = %.5f", main.media1()));
    }

    public Double media1(){
        Double notaA ;
        Double notaB;
        Double media;

        Scanner scanner = new Scanner(System.in);
        notaA = scanner.nextDouble();
        notaB = scanner.nextDouble();

        notaA = (notaA * 3.5);
        notaB = (notaB * 7.5);
        media = ((notaA + notaB) / 11);

        return media;
    }
}
