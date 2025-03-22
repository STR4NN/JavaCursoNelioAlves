package org.example.POO.Polimorphism;

public class Food {

    private double peso;
    public Food (double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;

        }
    }
}
