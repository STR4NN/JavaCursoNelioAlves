package org.example.Foreach;

import java.util.Arrays;

public class ExerciseForeach {
    public static void main(String[] args) {

        // Trocando todos os FORI por Foreach. Arrays
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8; // Transforma esse int em double automaticamente
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;


        /* Classe Array java util tem esse metodo ToString para exibir informações
         do Array*/

   /*     System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);*/

        double totalAlunoA = 0;
    /*    for (int i = 0; i < notasAlunoA.length; i++) {
            // Navegando pelo array atraves do for.
            totalAlunoA += notasAlunoA[i];
        }*/

        for (double notaA: notasAlunoA){
            totalAlunoA += notaA;
            System.out.println(totalAlunoA);
        }

        System.out.println("Media aluno A: "+ totalAlunoA/ notasAlunoA.length);

        final double notaArmazenada = 5.9;

        double[] notasAlunoB = {6.9, 8.9,notaArmazenada,10};
        double totalAlunoB = 0;

//        for (int i = 0; i < notasAlunoB.length; i++) {
//            totalAlunoB += notasAlunoB[i];
//        }

        for (double notaB : notasAlunoB){
            totalAlunoB += notaB;
        }
        System.out.println("Media do aluno B: " + totalAlunoB/ notasAlunoB.length);
    }
}
