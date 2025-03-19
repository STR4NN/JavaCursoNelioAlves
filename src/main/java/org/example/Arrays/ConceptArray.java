package org.example.Arrays;

public class ConceptArray {
    /* Array é estatico, sempre antes de iniciarmos um array
     temos que definir o valor do tamanho.
     =====================================================
     Homogeneo, quando defirnimos que ele é um INT, ele sempre recebera
     apenas valores inteiros;
     ===================================================
     Tambem é indexado, array com 6 posições começa do indice zero até
     o 5.

    Array é um objeto, tem atributos relacionados a ele.
     */

    // Inicia array com 6 posições

    public static void main(String[] args) {
        double[] a = new double[6];
        a[2] = 10.0;
        a[0] = 9.2;

        // Matriz de 3, é feita apenas por um array dentro de um array.

        // Array multidimensional = Um array dentro do outro.

        int[][] teste= new int[2][2];
        int valor;

     /*
     Tentando navegar em Array multidimensional

       for (int i = 0; i < teste.length; i++) {
            teste[i][i] = i;
            System.out.println(teste[i][i]);
        }
*/

        System.out.println(a[5]);

    }




}
