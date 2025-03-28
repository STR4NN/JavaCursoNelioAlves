package org.example.Lambdas.Interfaces;

public class Multiply implements  Calculated{
    @Override
    public double executar(double a, double b) {
        return a*b;
    }
}
