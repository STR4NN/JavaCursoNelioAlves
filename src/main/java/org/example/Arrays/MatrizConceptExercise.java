package org.example.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizConceptExercise {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos: ");
        int qtdDeAlunos = entrada.nextInt();

        System.out.println("Quantos notas por aluno? : ");
        int qtDeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdDeAlunos][qtDeNotas];

        double total = 0;
        System.out.println(notasDaTurma.length);
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do Aluno %d: ", (i + 1), (j +1) );
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];

            }

        }
        double media = total / (qtdDeAlunos*qtDeNotas);
        System.out.println("Media da turma é : " + media );

        for (double[] notas: notasDaTurma){
            System.out.println(Arrays.toString(notas));
        }

    }
}
