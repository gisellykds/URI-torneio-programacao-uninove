package main.java.aquecimento.ex1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(String.format("A=%.4f", main.areaCirculo()));
    }

    public Double areaCirculo(){
        Double area;
        Double raio;
        Double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        raio = scanner.nextDouble();

        area = pi * (Math.pow(raio, 2)); //ou (raio * raio)

       return area;
    }

    /*
    PROBLEMA:

    A fórmula para calcular a área de uma circunferência é: area = π . raio2.
    Considerando para este problema que π = 3.14159:
    Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

    Apresentar a mensagem "A=" seguido pelo valor da variável area, com 4 casas após o ponto decimal.

     */
}
