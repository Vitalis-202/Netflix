package Netflix;

import java.util.ArrayList;

public class Ejecutable {

    public static void main(String[] args) {

        try{

            //Creación de los ArrayList
            ArrayList<Pelicula> misPelis  = new ArrayList<Pelicula>();
            ArrayList<Serie> misSeries  = new ArrayList<Serie>();

            //Creación de Peliculas (Manual)
            misPelis.add(new Pelicula("Pulp Fiction","Comedia Negra","Quentin Tarantino",154,1994));
            misPelis.add(new Pelicula("Footloose","Romance","Herbert Rose",107,1984));
            misPelis.add(new Pelicula("StarShip Troopers","Ciencia Ficcion","Paul Verhoeven",129,1997));
            misPelis.add(new Pelicula("Alien","Ciencia Ficcion","Ridley Scott",116,1979 ));
            misPelis.add(new Pelicula("Robocop","Ciencia Ficcion","Paul Verhoeven",102,1987));

            //Creacion de Series (Manual)
            misSeries.add(new Serie("Dark","Baran bo Odar"));
            misSeries.add(new Serie("Lost","J. J. Abrams"));
            misSeries.add(new Serie("The Flash","Super Heroes","Greg Berlanti",50,6));
            misSeries.add(new Serie("SuperGirl","Super Heroes","Andrew Kreisberg",50,4));
            misSeries.add(new Serie("Z-Nation","Zombies","Karl Schaefer",50,5));

            //Ver series y pelicuas
            misPelis.get(2).marcarVisto();
            misPelis.get(4).marcarVisto();
            misSeries.get(0).marcarVisto();
            misSeries.get(3).marcarVisto();

            //Lista de peliculas y series
            System.out.println("Peliculas Vistas");
            for (Pelicula p:misPelis){
                if(p.getVisto()==true){
                    System.out.print(p.getTitulo()+" -Tiempo visto- "+p.tiempoVisto(p.getDuracion()));
                    System.out.println();
                }
            }
            System.out.println("Series Vistas");
            int contador = 0;
            for (Serie s:misSeries){
                if(s.getVisto()==true){
                    System.out.print(s.getTitulo() +" -Tiempo visto- "+s.tiempoVisto(20+5*contador));
                    System.out.println();
                }
                contador++;
            }

            //Pelicula del ano mas reciente
            int ano_aux = 0;
            int repeticion = 0;
            contador = 0;
            for (Pelicula p:misPelis){

                if(p.getAno()>ano_aux){
                    ano_aux = p.getAno();
                    repeticion = contador;
                }
                contador++;
            }
            System.out.println("La pelicula del ano mas reciente es "+misPelis.get(repeticion).toString());

            int serie_aux = 0;
            repeticion = 0;
            contador=0;
            for (Serie s:misSeries){

                if(s.getNoTemporadas()>serie_aux){
                    serie_aux = s.getNoTemporadas();
                    repeticion = contador;
                }
                contador++;
            }
            System.out.println("La serie con mas temporadas es "+misSeries.get(repeticion).toString());

        }catch (ArrayIndexOutOfBoundsException arrayE){
            System.out.println("Estas intentando entrar a una localidad que no esta definida");
        }catch(Exception e){
            System.out.println("Ocurrio este error: ");
            e.printStackTrace();
        }
        finally{
            System.out.println("Muchas gracias por ver el programa");
        }

    }
}
