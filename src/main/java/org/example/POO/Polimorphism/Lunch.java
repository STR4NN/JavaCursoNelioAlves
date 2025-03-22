package org.example.POO.Polimorphism;

public class Lunch {
    public static void main(String[] args) {
        Pearson invited = new Pearson(99.65);

        Rice ingrediente1 = new Rice(0.200);
        Beans ingrediente2 = new Beans(0.100);
        System.out.println(invited.getPeso());

        invited.comer(ingrediente1);
        invited.comer(ingrediente2);

        System.out.println(invited.getPeso());

        IceCream desert = new IceCream(0.4);
        invited.comer(desert);
        System.out.println(invited.getPeso());
    }
}
