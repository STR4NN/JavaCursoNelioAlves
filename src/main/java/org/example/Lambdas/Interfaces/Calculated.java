package org.example.Lambdas.Interfaces;

// Quando a interface criada só possui um unico metodo.
// Só Atraves das Interfaces funcionais que é possivel criar LAMBDAS ou INTERFCES FUNCIONAIS.
@FunctionalInterface
public interface Calculated {
    /*public abstract*/ double executar(double a, double b);

    // Só pode ter apenas um unico metodo. double teste();

    // Metodos default não atrapalham na funçao de Interface Funcional
    default String legal(){
        return "legal";
        //Aceita Parametros
    }

    // Static tambem são aceitos
    static String muitoLegal(){
        return "muito legal";
    }
}
