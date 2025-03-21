package org.example.Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackConcept {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();



//        System.out.println(livros.peek());
//        System.out.println(livros.element());

        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        for(String livro : livros){
            System.out.println(livro);
            livros.poll();

            if (livros.isEmpty()){
                System.out.println("Acabou os livros.");
            }
        }
    }
}
