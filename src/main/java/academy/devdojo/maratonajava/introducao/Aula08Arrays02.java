package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays02 {

    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Sakura";
        nomes[1] = "Kisuke";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }

}
