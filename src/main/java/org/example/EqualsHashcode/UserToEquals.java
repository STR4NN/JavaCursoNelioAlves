package org.example.EqualsHashcode;

public class UserToEquals {
    public String nome;
    public String email;

    public UserToEquals(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
public boolean equals(Object object) {
        if(object instanceof UserToEquals){// Se object for instancia de UserToEquals

            UserToEquals outro = (UserToEquals) object; // Converte o Object na classe desejada ( Cast)

             boolean emailIgual = outro.email.equals(this.email) ;
             boolean nomeIgual = outro.nome.equals(this.nome) ;

             return nomeIgual && emailIgual;
        }
        else {
            return false;
        }
}

}
