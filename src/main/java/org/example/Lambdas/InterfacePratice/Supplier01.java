package org.example.Lambdas.InterfacePratice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier01 {
    public static void main(String[] args) {

        // Não retorna absolutamente nada, não recebe nenhum parametro
        Supplier<List<String>> umLista = () -> Arrays.asList("Ana",
                "Bia", "Lia", "Gui");

        System.out.println(umLista.get());
    }



}
