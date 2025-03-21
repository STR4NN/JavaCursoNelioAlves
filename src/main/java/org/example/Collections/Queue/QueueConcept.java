package org.example.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // Joga uma exceção, gera um erro caso adicione algo que nao cabe mais
        fila.offer("Bia"); // Retorna verdadeiro ou falso. caso consigo ou não adicionar na fila
        fila.add("Carlos");  // Diferença apenas quando a fila estiver CHEIA
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // Vê o elemento da fila
        System.out.println(fila.peek()); // Vê o elemento da fila

        System.out.println(fila.element()); // Mesma coisa, so muda quando a fila esta vazia

       /* fila.size();
        fila.clear();
        fila.isEmpty();*/

        System.out.println(fila.poll()); // Retorna o primeiro elemento e ja remove o elemento.


         }

    }
