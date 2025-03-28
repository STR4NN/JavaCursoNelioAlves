package org.example.Lambdas.InterfacePratice;

public class Predicate {
    public static void main(String[] args) {

        // Recebe um unico parametro e sempre retorna Boolean.
        java.util.function.Predicate<Product> isExpensive
                = prod  -> (prod.preco * (1 - prod.desconto)) >= 750 ;

        Product product = new Product("Nootbook",
                3893.89 , 0.15);

        System.out.println(isExpensive.test(product));
    }
}
