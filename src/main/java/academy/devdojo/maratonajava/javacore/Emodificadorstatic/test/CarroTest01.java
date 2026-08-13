package academy.devdojo.maratonajava.javacore.Emodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Emodificadorstatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Porsche", 290);

        Carro.setVelocidadeLimite(67);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
