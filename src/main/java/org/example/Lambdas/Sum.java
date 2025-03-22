package org.example.Lambdas;

public class Sum implements Calculated
{

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
