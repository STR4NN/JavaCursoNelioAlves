package org.example.POO.Polimorphism;

public class Pearson {

    private double peso;
    public Pearson (double peso){
        setPeso(peso);
    }

    public void comer(Food food){
        this.peso += food.getPeso();
    }
//
//    public void comer(Beans beans){
//        this.peso += beans.getPeso();
//    }
//
//    public void comer(IceCream iceCream){
//        this.peso += iceCream.getPeso();
//    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;

        }
    }
}
