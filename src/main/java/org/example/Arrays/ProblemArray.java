package org.example.Arrays;

import java.util.Scanner;

public class ProblemArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tamanhoDoArray = scan.nextDouble();
        System.out.println("Escreva quantas notas você quer adicionar: ");

        double[] notas = new double[(int) tamanhoDoArray];
        double valorSomaDasNotas = 0;
        double mediaDasNotas;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota da sua " + (i + 1) + " prova : " );
            notas[i] = scan.nextDouble();
        }

        for (double nota : notas){
            valorSomaDasNotas += nota;
        }


        System.out.println("Soma total das notas: " + valorSomaDasNotas);
        mediaDasNotas = valorSomaDasNotas / notas.length;
        System.out.println("A sua média é: " + mediaDasNotas);

    }
}
