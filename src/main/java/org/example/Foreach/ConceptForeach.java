package org.example.Foreach;

public class ConceptForeach {
    public static void main(String[] args) {
        double[] notas = {9.9,8.7,7.2,9.4};

        // Estrutura de controle, mas muito mais
        // utilizado no contexto de Arrays

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " " );
        }
        for (double nota : notas){
            System.out.print(nota + " ");

        }

    }
}
