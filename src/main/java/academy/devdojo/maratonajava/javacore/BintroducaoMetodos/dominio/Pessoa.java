package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Pessoa {
    private String nome;
    private Integer idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
