package streaming;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void adicionar(Item item){
        List<Item> listaDeItens = new ArrayList<>();
        listaDeItens.add(item);
        imprimir(listaDeItens);
    }

    public static void imprimir(List<Item> listaDeItens){

        for (Item item : listaDeItens) {
            item.imprimir();
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //Adicionando Filmes
        Filmes jno = new Filmes("Jogador N° 1", "Ficção científica/Ação", "Steven Spielberg", 140);
        Filmes osc = new Filmes("Os 7 de Chicago", "Drama", "Aaron Sorkin", 129);
        Filmes shang = new Filmes ("Shang-Chi e a Lenda dos Dez Anéis", "Ação/Fantasia", "Destin Cretton", 132);
        Filmes sonic = new Filmes ("Sonic: O Filme", "Comédia/Infantil", "Jeff Fowler", 99);

        adicionar(jno);
        adicionar(osc);
        adicionar(shang);
        adicionar(sonic);

        // Adicionando Séries
        Serie dark = new Serie("Dark", "Drama/Suspense/Ficção Científica/Mistério", "Baran bo Odar, Jantje Friese", 3);
        Filmes segredos = new Filmes("Segredos", "Drama", "Baran bo Odar", 51);
        Filmes mentiras = new Filmes("Mentiras", "Mistério", "Baran bo Odar", 44);
        Filmes pep = new Filmes("Passado e Presente", "Mistério", "Baran bo Odar", 45);
        Filmes vidadupla = new Filmes ("Vidas Duplas", "Mistério", "Baran bo Odar", 47);
        Filmes verdades = new Filmes ("Verdade", "Drana/Mistério", "Baran bo Odar", 45);
        Filmes afcom = new Filmes ("Assim Foi Criado o Mundo", "Suspense/Drama", "Baran bo Odar", 51);
        Filmes pc = new Filmes ("Ponto Crítico", "Suspense/Mistério", "Baran bo Odar", 51);
        Filmes vcoqp = new Filmes ("Você Colhe o Que Planta", "Drama/Suspense", "Baran bo Odar", 50);
        Filmes taa = new Filmes ("Tudo Acontece Agora", "Suspense/Mistério", "Baran bo Odar", 55);
        Filmes alfaomega = new Filmes ("Alfa e Ômega", "Suspense/Mistério/Drama", "Baran bo Odar", 57);

        dark.adicionar(segredos);
        dark.adicionar(mentiras);
        dark.adicionar(pep);
        dark.adicionar(vidadupla);
        dark.adicionar(verdades);
        dark.adicionar(afcom);
        dark.adicionar(pc);
        dark.adicionar(vcoqp);
        dark.adicionar(taa);
        dark.adicionar(alfaomega);
        adicionar(dark);

        // Adicionando Show
        Show show = new Show("Evolve - Imagine Dragons", "Indie Rock/Pop rock", "Imagine Dragons");
        Filmes idkw = new Filmes ("I Don't Know Why", "Alternative", "Imagine Dragons", 3);
        Filmes wit = new Filmes ("Whatever It Takes", "Pop rock", "Imagine Dragons", 3);
        Filmes believer = new Filmes ("Beiever", "Pop rock/Alternative/Electropop", "Imagine Dragons/Alex da Kid/Joel Little/Mattman & Robin", 3);
        Filmes wtw = new Filmes ("Walking the Wire", "Pop rock/Alternative", "Imagine Dragons", 4);
        Filmes riseup = new Filmes ("Rise Up", "Alternative/Pop Rock", "Imagine Dragons", 4);
        Filmes imiuty = new Filmes ("I'll Make It Up to You", "Pop Rock/Alternative", "Imagine Dragons", 5);
        Filmes yesterday = new Filmes ("Yesterday", "Indie Rock", "Imagine Dragons", 3);
        Filmes motr = new Filmes ("Mouth of the River", "Pop Rock", "Imagine Dragons", 3);
        Filmes thunder = new Filmes ("Thunder", "Synthpop/Trap", "Imagine Dragons", 3);
        Filmes start= new Filmes ("Start Over", "Alternative", "Imagine Dragons", 3);
        Filmes ditd = new Filmes ("Dancing in the Dark", "Indie Rok", "Imagine Dragons", 4);

        show.adicionar(idkw);
        show.adicionar(wit);
        show.adicionar(believer);
        show.adicionar(wtw);
        show.adicionar(riseup);
        show.adicionar(imiuty);
        show.adicionar(yesterday);
        show.adicionar(motr);
        show.adicionar(thunder);
        show.adicionar(start);
        show.adicionar(ditd);
        adicionar(show);
    }

}
