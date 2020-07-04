package Netflix;

public class Serie extends Audiovisual implements Visualizable {

    private int noTemporadas;

    //Constructor vacío
    public Serie() {
        this.noTemporadas = 1;
    }
    //Constructor titulo+creador
    public Serie(String titulo, String creador) {
        super(titulo, creador);
        this.noTemporadas = 1;
    }
    //Constructor completo
    public Serie(String titulo, String genero, String creador, int duracion, int noTemporadas) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
    }

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public String toString() {
        return super.toString()+'\''+
                "noTemporadas='" + noTemporadas  ;
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
