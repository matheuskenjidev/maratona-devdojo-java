package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String studio;

    public Anime(String nome, String tipo, int episodio, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodio, String genero, String studio) {
        this(nome, tipo, episodio, genero);
        this.studio = studio;
    }


    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodio=" + episodio +
                ", genero='" + genero + '\'' +
                '}';
    }
}
