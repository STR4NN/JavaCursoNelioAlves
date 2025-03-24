package org.example.Lambdas;

import java.util.Arrays;
import java.util.List;

public class FunctionalForeach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional: ");
        for (String nome : aprovados){
            System.out.println(nome);
        }
        System.out.println("\nLambda #01:  ");
        // nome é o parametro.
        aprovados.forEach(nome -> {System.out.println(nome + " !!!");});

        // Apenas imprime, não tem flexibilidade.
        System.out.println("\nMethod Reference:  ");
        aprovados.forEach(System.out::println);
    }


}
