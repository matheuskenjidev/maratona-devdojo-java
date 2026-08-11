package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.falaroi();
        calculadora.somarDoisNumeros(5, 7);
        calculadora.substraiDoisNumeros(1, 5);
    }
}
