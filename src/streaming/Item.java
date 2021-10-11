package streaming;

public abstract class Item {

    protected String titulo;
    protected String genero;
    protected String diretor;

    public Item(String titulo, String genero, String diretor){
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public abstract int getDuracao();

    public abstract void imprimir();


}
