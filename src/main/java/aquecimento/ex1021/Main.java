package main.java.aquecimento.ex1021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.cedulasMoedas();
    }

    public void cedulasMoedas(){
        Scanner leitor = new Scanner(System.in);
        Double dinheiroTotal = leitor.nextDouble();
        Integer notas = dinheiroTotal.intValue();

        //calculo notas
        Double of = ((dinheiroTotal - notas) * 100);
        Integer moedas = of.intValue();

        Integer notasCem = notas / 100;
        notas -= notasCem * 100;

        Integer notasCinquenta = notas / 50;
        notas -= notasCinquenta * 50;

        Integer notasVinte = notas / 20;
        notas -= notasVinte * 20;

        Integer notasDez = notas / 10;
        notas -= notasDez * 10;

        Integer notasCinco = notas / 5;
        notas -= notasCinco * 5;

        Integer notasDois = notas / 2;
        notas -= notasDois * 2;

        //calculo moedas
        Integer moedasUmReal = notas;
        notas -= moedasUmReal * 1;

        Integer moedasCinquenta = moedas / 50;
        moedas -= moedasCinquenta * 50;

        Integer moedasVinteCinco = moedas / 25;
        moedas -= moedasVinteCinco * 25;

        Integer moedasDez = moedas / 10;
        moedas -= moedasDez * 10;

        Integer moedasCinco = moedas / 5;

        moedas -= moedasCinco * 5;
        Integer moedasUm = moedas;

        System.out.println("NOTAS:");
        System.out.println(notasCem + " nota(s) de R$ 100.00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notasVinte+ " nota(s) de R$ 20.00");
        System.out.println(notasDez + " nota(s) de R$ 10.00");
        System.out.println(notasCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedasUmReal + " moeda(s) de R$ 1.00");
        System.out.println(moedasCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(moedasVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(moedasDez + " moeda(s) de R$ 0.10");
        System.out.println(moedasCinco + " moeda(s) de R$ 0.05");
        System.out.println(moedasUm + " moeda(s) de R$ 0.01");
    }
}
