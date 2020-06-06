package main.java.aquecimento.ex1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.cedulas();
    }

    public void cedulas(){
        Integer troco, notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, notaUm;
        Scanner scanner = new Scanner(System.in);
        troco = scanner.nextInt();

        System.out.println(troco);

        notaCem = (troco/100);
        troco = troco - (notaCem * 100);

        notaCinquenta = (troco/50);
        troco = troco - (notaCinquenta * 50);

        notaVinte = (troco/20);
        troco = troco - (notaVinte * 20);

        notaDez = (troco/10);
        troco = troco - (notaDez * 10);

        notaCinco = (troco/5);
        troco = troco - (notaCinco * 5);

        notaDois = (troco/2);
        troco = troco - (notaDois * 2);

        notaUm = (troco/1);
        troco = troco - (notaUm * 1);

        System.out.println(notaCem + " nota(s) de R$ 100,00");
        System.out.println(notaCinquenta + " nota(s) de R$ 50,00");
        System.out.println(notaVinte + " nota(s) de R$ 20,00");
        System.out.println(notaDez + " nota(s) de R$ 10,00");
        System.out.println(notaCinco + " nota(s) de R$ 5,00");
        System.out.println(notaDois + " nota(s) de R$ 2,00");
        System.out.println(notaUm + " nota(s) de R$ 1,00");

    }
}
