package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    public void falaroi() {
        System.out.println("oi");
    }

    public void somarDoisNumeros(int a, int b) {
        System.out.println(a + b);
    }

    public void substraiDoisNumeros(int a, int b) {
        System.out.println(a - b);
    }

    public void somaarray(int[] inteiros) {
        int soma = 0;
        for (int num: inteiros) {
            soma+= num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma+= num;
        }
        System.out.println(soma);
    }
}
