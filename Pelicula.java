package Netflix;

public class Pelicula extends Audiovisual implements Visualizable {

    private int ano;

    //Constructor vacio
    public Pelicula() {
        this.ano = 1900;//referencia 1900 como inicio de creación de peliculas
    }
    //Constructor titulo + creador
    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }
    //Constructor completo
    public Pelicula(String titulo, String genero, String creador, int duracion, int ano) {
        super(titulo, genero, creador, duracion);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString()+'\''+
                "ano='" + ano  ;
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
