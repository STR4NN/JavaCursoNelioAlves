package org.example.Collections.List;

import java.util.ArrayList;

public class ListConcept {
    // Pode ser heterogenea ou homogenea;
    // Pode ter objetos duplicados;
    // É ordenada;
    // É indexada (Acesso pelo indice);

    public static void main(String[] args) {
        ArrayList<UsuarioList> lista = new ArrayList<>();

        UsuarioList user1 = new UsuarioList("Ana");
        lista.add(user1);
        lista.add(new UsuarioList(("Carlos")));
        lista.add(new UsuarioList(("Lia")));
        lista.add(new UsuarioList(("Bia")));
        lista.add(new UsuarioList(("Manu")));

        System.out.println("3 : " + lista.get(3)); // Acesso pelo indice.

        lista.remove(1);
        System.out.println(lista.remove(new UsuarioList("Manu")));

        System.out.println(lista.contains("Tem : " + new UsuarioList("Lia")));


        for (UsuarioList u: lista){
            System.out.println(u.nome);
        }
    }
}
