package Netflix;

public class Pelicula extends Audiovisual implements Visualizable {

    private int año;

    //Constructor vacío
    public Pelicula() {
        this.año = 1900;//referencia 1900 como inicio de creación de peliculas
    }
    //Constructor titulo + creador
    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }
    //Constructor completo
    public Pelicula(String titulo, String genero, String creador, int duracion, int año) {
        super(titulo, genero, creador, duracion);
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return super.toString()+'\''+
                "año='" + año  ;
    }

    @Override
    public boolean marcarVisto() {
        super.setVisto(true);
        return super.getVisto();
    }

    @Override
    public void esVisto() {

        System.out.println("es Visto: "+super.getVisto());
    }

    @Override
    public int tiempoVisto(int tiempo) {
        return tiempo;
    }
}
