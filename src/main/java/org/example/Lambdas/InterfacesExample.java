package org.example.Lambdas;

import java.util.function.UnaryOperator;

public class InterfacesExample {

    // Nada -> Tipo = Supplier
    // Tipo -> Nada = Consumer | não retorna nada
    // Tipo -> Tipo = Unary Operator

    // Tipo, Tipo -> Tipo = Binary Operator
    // Recebe 2 double e retorna um Double

    // S -> Tipo = Function | Recebe Date -> return numero; ENCADEAVEL

    // Tipo -> Bollean = Predicate

    // Boxing primitivo -> Classe (Wrapper
    // Unboxing Wrapper -> Primitivo.

    //IntBinaryOperator -> Interfaces, utilizam tipos primitivos.

    public static void main(String[] args) {
        UnaryOperator<String> oneOperator = (nome -> {
            return nome = "Sara";
        });
    }
}
