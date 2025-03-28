package org.example.Lambdas.Interfaces;

public class Sum implements Calculated
{

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
