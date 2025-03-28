package org.example.Lambdas.Interfaces;

public class Calculating {
    public static void main(String[] args) {
        Calculated soma = new Sum();
        Calculated multiplicar = new Multiply();

        System.out.println(soma.executar(2,3));
        System.out.println(soma.executar(2,3));

    }
}
