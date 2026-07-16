package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("Digite um numero valido!");
                break;

        }

        char sexo ='M';
        switch (sexo) {
            case 'F': {
                System.out.println("sexo feminino");
                break;
            }
            case 'M': {
                System.out.println("sexo masculino");
                break;
            }
        }
    }
}
