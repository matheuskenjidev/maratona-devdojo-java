package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DEVDOJO";
        String mensagemNaoDoar = "Eu ainda n tenho condicoes";
//        String resultado;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

//        if(salario > 500) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }

        System.out.println(resultado);
    }
}
