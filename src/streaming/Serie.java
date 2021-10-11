package streaming;

public class Serie extends  ItemAgrupado {

    public int temporadas;

    public Serie(String titulo, String genero, String diretor, int temporadas) {
        super(titulo, genero, diretor);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {

        return temporadas;
    }

    @Override
    public void imprimir() {
        System.out.println("\n" + getTitulo() + " (" + getGenero() + ") ");
        super.imprimir();
        System.out.println("  Temporadas: " + getTemporadas());
    }

}
