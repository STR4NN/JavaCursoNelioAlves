package org.example.Collections.Set;

import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {
    public static void main(String[] args) {
        // Agora o meu conjunto aceita apenas String
//        Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); // Tree Set garante a ordem de inserção.
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        // Não tem ordenação. (A não ser que seja um TreeSet)
        for (String nomes: listaAprovados){
            System.out.println(nomes);
        }
        SortedSet<Integer> nums = new TreeSet<>(); // Tree Set garante a ordem de inserção.
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums){
            System.out.println(n);
        }

    }
}
