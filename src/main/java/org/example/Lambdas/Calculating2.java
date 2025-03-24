package org.example.Lambdas;

import java.util.function.BinaryOperator;

public class Calculating2 {
    public static void main(String[] args) {
        // Funções que não tem nome.
        // Muito melhor para otimizar codigo. (Muita logica, pouco codigo)
        // Recebe os parametros do outro metodo da INTERFACE
        // A variavel soma é do tipo Calculated, que é uma Interface com apenas um
        // unico metodo;

        Calculated soma = (x,y) -> {return x + y;};
        System.out.println(soma.executar(2,3));

        soma = (x,y) -> x * y;
        System.out.println(soma.executar(2,3));

        // int -> Double (Não é possivel)
        BinaryOperator<Double> calc = (x,y) -> {return x + y;};
        System.out.println(calc.apply(2.2,3.2));

        BinaryOperator<Integer> calc2 = (x,y) -> {return x + y;};
        System.out.println(calc2.apply(3,2));

        System.out.println(soma.legal());
        System.out.println(Calculated.muitoLegal());
    }
}
