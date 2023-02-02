package EjercicioBiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {
    }
   Libro (String titulo, String autor,int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados  = prestados;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int numEjemplares) {
        this.ejemplares = numEjemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int numPrestados) {
        this.prestados = numPrestados;
    }
}