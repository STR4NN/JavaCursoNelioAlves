package org.example.Lambdas.InterfacePratice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperator01 {
    public static void main(String[] args) {
        // Os dois parametros e o retorno são do mesmo tipo
        BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // 3 Tipos diferentes, tipo dos parametros e do retorno
        BiFunction<Double, Double , String> resultado = (n1, n2) ->
                ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado"  ;

        System.out.println(resultado.apply(9.7,5.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Repovado";

        System.out.println(media.andThen(conceito).apply(9.7,4.1));
    }
}
