package org.example.Lambdas.InterfacePratice;

import java.util.function.Predicate;

public class ComposerPredicate {
    public static void main(String[] args) {
        // Recebe um parametrp e retorna um boolean
        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> isTresDigitos = num -> num >= 100 &&
                num <= 999;

        System.out.println(isPar.and(isTresDigitos).negate().test(22));

        // Temos funcções para muitos tipos de condições
        System.out.println(isPar.or(isTresDigitos).negate().test(22));
    }
}
