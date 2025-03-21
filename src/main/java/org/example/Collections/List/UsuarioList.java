package org.example.Collections.List;

import java.util.Objects;

public class UsuarioList {
    String nome;

    public UsuarioList(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioList that = (UsuarioList) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
