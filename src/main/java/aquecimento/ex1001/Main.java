package main.java.aquecimento.ex1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        System.out.println("X = " + main.somar());
    }

    public Integer somar(){
        Integer a;
        Integer b;
        Integer soma;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        soma = (a + b);
        return soma;
    }

    /*
    PROBLEMA:

    Leia 2 valores inteiros e armazene-os nas variáveis A e B.
    Efetue a soma de A e B atribuindo o seu resultado na variável X.
    Imprima X conforme exemplo apresentado abaixo.

    "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.

     */
}
