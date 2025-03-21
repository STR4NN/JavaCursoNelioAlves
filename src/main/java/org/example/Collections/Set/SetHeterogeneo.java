package org.example.Collections.Set;

import java.util.HashSet;
import java.util.Set;

// Pode ser Heterogeneo = Varios Tipos de Dados.
// Pode ser Homogeneo ( Ideal ) = Apenas um tipo de dados

// Não aceita REPETIÇÃO
// Pode ser ordenado ou não.
// Não é indexado.

public class SetHeterogeneo {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        // Conjunto = HashSet
        HashSet conjunto = new HashSet ();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // int -> Integer
        conjunto.add('x');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("teste"); // Minusculo então aceita.
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));

        System.out.println(conjunto.contains('x')); // Verifica se contem algum valor especifico.

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

      //  conjunto.addAll(nums); // União de 2 Collections
        conjunto.retainAll(nums); // Mantem apenas os valores iguais, entre nums e conjunto.
        System.out.println(conjunto);

        conjunto.clear(); // Limpar o conjunto.
    }



}
