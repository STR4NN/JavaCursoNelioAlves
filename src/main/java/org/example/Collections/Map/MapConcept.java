package org.example.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {
    public static void main(String[] args) {
        // Estrutura Chave e Valor
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // Não tem o metodo ADD, adiciona se não existir, e coloca por cima caso exista;
        usuarios.put(2, "Ricardo"); // Inclui e substitui tambem
        usuarios.put(20, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); // Não pode ter duplicação
        System.out.println(usuarios.keySet()); // Retorno um SET ( conjunto das chaves )

        System.out.println(usuarios.values()); // Pega os valores
        System.out.println(usuarios.entrySet()); // Pega chave e valor

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(1)); // Você pega o valor atraves da KEY, e não do index.



        for (int key : usuarios.keySet()){
            System.out.println(" Chave: " + key);
        }

        for (String value : usuarios.values()){
            System.out.println("Valor: " + value);
        }

        for (Map.Entry<Integer, String> register : usuarios.entrySet()){
            System.out.print(register.getKey() + "=======> " );
            System.out.print(register.getValue() );
        }



    }
}
