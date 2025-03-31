package org.example.Lambdas.InterfacePratice;

public class Function {
    public static void main(String[] args) {

        // Entra um valor e retorna outro tipo
        java.util.function.Function<Integer, String>
        parOuImpar =numero ->  numero % 2 == 0
                ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        java.util.function.Function<String, String> oResultadoe =
                valor -> "O resultado é: " + valor;

        java.util.function.Function<String, String> concatena =
                resultado -> resultado + "!!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoe).andThen(concatena)
                .apply(32); // Os 2 resultados são Strings

        System.out.println(resultadoFinal);

    }
}
