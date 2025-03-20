package org.example.EqualsHashcode;

public class EqualsConcept {
    public static void main(String[] args) {
        //  Equals & HashCode
         /*Quando você instancia um objeto, ele aponta para um valor na memoria;
         Produto p1 = new Produto;

         p1.nome = "Caneta"; p2.nome = "Caneta";
         Se eu igualar eles: p1 == p2 = false, pois estão em endereços de memorias diferentes.*/

        // Pra isso que serve o metodo EQUALS (Todas as classes recebe esse metodo.).
        //p.1.equals(p2); falso, por padrao o equals segue a logica do ==;
        // RETORNO : Hashcode = inteiro; Equals = boolean;
        // Hashcode é mais rapido, faz uma busca rapida e seleciona opções para busca.
        // É usado antes do equals para facilitar a busca.
    }
}
