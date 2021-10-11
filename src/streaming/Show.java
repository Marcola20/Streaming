package streaming;

public class Show extends ItemAgrupado {

    public Show(String titulo, String genero, String diretor) {

        super(titulo, genero, diretor);
    }

    @Override
    public void imprimir() {
        System.out.print("\n" + getTitulo());
        System.out.print(" (" + getGenero() + ")" + "\n");
        super.imprimir();
    }
}