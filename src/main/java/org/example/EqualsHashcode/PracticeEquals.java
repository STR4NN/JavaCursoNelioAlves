package org.example.EqualsHashcode;

public class PracticeEquals {

    public static void main(String[] args) {
        UserToEquals user1 = new UserToEquals("Pedro Silva", "Pedro.silva.ezemail.com.br");
        UserToEquals u2 = new UserToEquals("Pedro Silva", "Pedro.silva.ezemail.com.br");

        System.out.println(user1 == u2); // Verifica o endereço na memoria ( que é diferente )
        System.out.println(user1.equals(u2));  // Verifica o endereço na memoria ( que é diferente )
        System.out.println(u2.equals(user1));

        // Verifica o endereço na memoria ( que é diferente )
    }
}
