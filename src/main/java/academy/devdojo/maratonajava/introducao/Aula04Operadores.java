package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 40;
        //+-*/
        System.out.println(numero1 - numero2);
        System.out.println(numero1 + numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero2 / numero1);

        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        boolean isDezIgualAVinte = 10 == 20;
        System.out.println(isDezIgualAVinte);

        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezDiferenteDeVinte);

    }
}
