package streaming;

import java.util.ArrayList;
import java.util.List;

public class ItemAgrupado extends Item {

    List<Filmes> listaDeFilmes = new ArrayList<>();

    public ItemAgrupado(String titulo, String genero, String diretor) {

        super(titulo, genero, diretor);
    }

    public void adicionar(Filmes filme) {

        listaDeFilmes.add(filme);
    }

    public List<Filmes> getFilmes() {

        return listaDeFilmes;
    }

    @Override
    public int getDuracao() {

        int duracao = 0;

        for (Filmes filme : listaDeFilmes) {
            duracao += filme.getDuracao();
        }

        return duracao;
    }

    @Override
    public void imprimir() {

        int cont = 1;

        for (Filmes filme : listaDeFilmes) {
            System.out.println("  " + cont + ". " + filme.getTitulo() + " (" + filme.getGenero() + ") " + "- " + filme.getDuracao() + " min");
            cont++;
        }
        System.out.println("  Duração total: " + getDuracao() + " min");
    }
}
