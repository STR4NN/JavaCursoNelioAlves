import java.util.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int tamanhoArray1 = 2;
        int tamanhoArray2 = 5;
        int tamanhoArray3 = 9;

        double[][][] testeArray = new double[tamanhoArray1][tamanhoArray2][tamanhoArray3];
        double[][] testeArray1 = new double[tamanhoArray1][tamanhoArray2];

        int valorAdiciona = 1;

        for (int i = 0; i < testeArray1.length ; i++) {
            for (int j = 0; j < testeArray1[i].length; j++) {
                testeArray1[i][j] = valorAdiciona;
                valorAdiciona++;
            }
        }
        for (double valor[]:
                testeArray1) {
//            System.out.println(Arrays.toString(valor) );
        }

        for (int i = 0; i < testeArray.length; i++) {
            for (int j = 0; j < testeArray[i].length; j++) {
                for (int k = 0; k < testeArray[i][j].length; k++) {
                  testeArray[i][j][k] = valorAdiciona;
                  valorAdiciona++;
                    System.out.println( testeArray[i][j].length);

                }
            }
            System.out.println();
        }
        for (double[][] plano : testeArray){
            for (double[] linha : plano){
                System.out.println(Arrays.toString(linha));

            }

        }

    }
}
