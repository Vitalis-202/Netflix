package Netflix;

public class Audiovisual {

    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto;

    //Constructor vacío
    public Audiovisual() {
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.duracion=0;
        this.visto=false;
    }
    //Constructor Titulo y creador

    public Audiovisual(String titulo, String creador) {
        this.titulo = titulo;
        this.genero = "";
        this.creador = creador;
        this.duracion = 0;
        this.visto= false;
    }

    //Constructor Titulo, genero, creador y duracion
    public Audiovisual(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto= false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean getVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", creador='" + creador + '\'' +
                ", duracion=" + duracion + '\'' +
                ", visto=" + visto;
    }
}
