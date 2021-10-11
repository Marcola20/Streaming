package streaming;

public class Filmes extends Item {

    private final int duracao;

    public Filmes(String titulo, String genero, String diretor, int duracao) {
        super(titulo, genero, diretor);
        this.duracao = duracao;
    }

    @Override
    public int getDuracao() {

        return duracao;
    }

    @Override
    public void imprimir() {

        System.out.println(titulo);
        System.out.println("  Gênero: " + getGenero());
        System.out.println("  Diretor: " + getDiretor());
        System.out.println("  Duração: " + getDuracao() + " min");
    }
}
