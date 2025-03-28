package org.example.Lambdas.InterfacePratice;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    // Entra : 1 Parametro -> Returna mada;
    public static void main(String[] args) {
        java.util.function.Consumer<Product> imprimir =
                p -> System.out.println(p.nome + "!!!!");

        Product produto = new Product("Caneta", 12.34, 0.09);
        imprimir.accept(produto);

        Product produto2 = new Product("Nootbook", 2987.99, 0.25);
        Product produto3 = new Product("Caderno", 19.90, 0.03);
        Product produto4 = new Product("Borracha", 7.80, 0.18);
        Product produto5 = new Product("Lapis", 4.39, 0.19);


        List<Product> produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5);

        produtos.forEach(imprimir);
        produtos.forEach( p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
