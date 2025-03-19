package org.example.Arrays;

import java.util.Arrays;

public class ExerciseArray {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8; // Transforma esse int em double automaticamente
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;


        /* Classe Array java util tem esse metodo ToString para exibir informações
         do Array*/

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            // Navegando pelo array atraves do for.
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA/ notasAlunoA.length);

       final double notaArmazenada = 5.9;

        double[] notasAlunoB = {6.9, 8.9,notaArmazenada,10};
        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB/ notasAlunoB.length);

        // Imprime variavel da memoria.
       // System.out.println(notasAlunoA);
    }
}
