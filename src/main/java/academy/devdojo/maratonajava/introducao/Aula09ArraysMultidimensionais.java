package academy.devdojo.maratonajava.introducao;

public class Aula09ArraysMultidimensionais {

    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 1;

        System.out.println(dias[0][0]);

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j ++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------------------");

        for(int[] arr: dias) {
            for (int num: arr) {
                System.out.println(num);
            }
        }
    }

}
