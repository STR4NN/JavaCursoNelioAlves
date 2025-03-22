package org.example.Lambdas;

public class Calculating2 {
    public static void main(String[] args) {
        // Funções que não tem nome.
        // Recebe os parametros do outro metodo da INTERFACE
        // A variavel soma é do tipo Calculated, que é uma Interface com apenas um
        // unico metodo;

        Calculated soma = (x,y) -> {return x + y;};
        System.out.println(soma.executar(2,3));

        // Muito melhor para otimizar codigo. (Muita logica, pouco codigo)
        soma = (x,y) -> x * y;
        System.out.println(soma.executar(2,3));
    }
}
