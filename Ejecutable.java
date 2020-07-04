package Netflix;

public class Ejecutable {

    public static void main(String[] args) {

        //Creación de los Arreglos
        Pelicula[]misPelis = new Pelicula[5];
        Serie[]misSeries = new Serie[5];

        //Creación de Peliculas (Manual)
        misPelis[0] = new Pelicula("Pulp Fiction","Comedia Negra","Quentin Tarantino",154,1994);
        misPelis[1] = new Pelicula("Footloose","Romance","Herbert Rose",107,1984);
        misPelis[2] = new Pelicula("StarShip Troopers","Ciencia Ficción","Paul Verhoeven",129,1997);
        misPelis[3] = new Pelicula("Alien","Ciencia Ficción","Ridley Scott",116,1979 );
        misPelis[4] = new Pelicula("Robocop","Ciencia Ficción","Paul Verhoeven",102,1987);

        //Creación de Series (Manual)
        misSeries[0] = new Serie("Dark","Baran bo Odar");
        misSeries[1] = new Serie("Lost","J. J. Abrams");
        misSeries[2] = new Serie("The Flash","Super Heroes","Greg Berlanti",50,6);
        misSeries[3] = new Serie("SuperGirl","Super Heroes","Andrew Kreisberg",50,4);
        misSeries[4] = new Serie("Z-Nation","Zombies","Karl Schaefer",50,5);

        //Ver series y pelicuas
        misPelis[2].marcarVisto();
        misPelis[4].marcarVisto();
        misSeries[0].marcarVisto();
        misSeries[3].marcarVisto();

        //Lista de peliculas y series
        System.out.println("Peliculas Vistas");
        for (int i = 0;i<misPelis.length;i++){
            if(misPelis[i].getVisto()==true){
                System.out.print(misPelis[i].getTitulo()+" -Tiempo visto- "+misPelis[i].tiempoVisto(misPelis[i].getDuracion()));
                System.out.println();
            }
        }
        System.out.println("Series Vistas");
        for (int i = 0;i<misSeries.length;i++){
            if(misSeries[i].getVisto()==true){
                System.out.print(misSeries[i].getTitulo() +" -Tiempo visto- "+misSeries[i].tiempoVisto(20+5*i));
                System.out.println();
            }
        }

        //Pelicula del año más reciente
        int año_aux = 0;
        int repeticion = 0;
        for (int i=0;i<misPelis.length;i++){

            if(misPelis[i].getAño()>año_aux){
                año_aux = misPelis[i].getAño();
                repeticion = i;
            }
        }
        System.out.println("La pelicula del año más reciente es "+misPelis[repeticion].toString());

        int serie_aux = 0;
        repeticion = 0;
        for (int i=0;i<misSeries.length;i++){

            if(misSeries[i].getNoTemporadas()>serie_aux){
                serie_aux = misSeries[i].getNoTemporadas();
                repeticion = i;
            }
        }
        System.out.println("La serie con más temporadas es "+misSeries[repeticion].toString());





    }
}
