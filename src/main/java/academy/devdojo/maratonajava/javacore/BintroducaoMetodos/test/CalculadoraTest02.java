package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] inteiros = {1,2,3,4,5};
        calculadora.somaarray(inteiros);
        calculadora.somaVarArgs(1,2,3,4,5,7,8,9);
    }
}
