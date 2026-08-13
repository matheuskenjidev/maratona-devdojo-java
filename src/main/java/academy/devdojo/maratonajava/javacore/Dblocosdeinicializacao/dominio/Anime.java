package academy.devdojo.maratonajava.javacore.Dblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7};
    {
        System.out.println("dentro do bloco de inicializacao");
    }

    public Anime() {
        for(int episodio: this.episodios) {
            System.out.println(episodio);
        }
    }
}
