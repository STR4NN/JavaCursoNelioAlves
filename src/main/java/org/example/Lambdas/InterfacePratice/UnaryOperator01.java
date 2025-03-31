package org.example.Lambdas.InterfacePratice;

import java.util.function.UnaryOperator;

public class UnaryOperator01 {
    public static void main(String[] args) {
        // O tipo do parametro é o tipo do retorno.
        // Se passa um int, vai retornar um int.

        // Funcções pequenas tem potencial de reuso.
        UnaryOperator<Integer> mais2 = n -> n + 2;
        UnaryOperator<Integer> vezes2 = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = mais2.andThen(vezes2).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

        // Compose faz executar a função de tras primeiro.
        int resultado2 = aoQuadrado.
                compose(vezes2).
                compose(mais2).apply(0);
    }
}
