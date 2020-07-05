# Proyecto Netflix
### Curso "Programando con Java para aplicaciones Android"Curso "Programando con Java para aplicaciones Android"
### V 1.0
### Instrucciones****
Desarrollar un código de Java siguiendo los pasos a continuación:

1. Crea una clase llamada Pelicula con las siguientes características:
- Atributos: titulo, genero, creador, año, duracion y visto.
- Constructores:
 - Un constructor default.
 - Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto.
 - Un constructor con todos los atributos, excepto visto. 
- Métodos:
 - Métodos get de todos los atributos, excepto visto.
 - Métodos set de todos los atributos, excepto visto.
 - Sobreescribe el método toString.

2. Crea una claseSeriecon las siguientes características:
- Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.
 - Por default, el número de temporadas es 1 y visto false.
 - El resto de atributos serán valores por defecto según el tipo de atributo. 
- Constructores:
  - Un constructor default.
  - Visto tendrá false por defecto.
  - Un constructor con todos los atributos, excepto visto.
- Métodos:
  - Un constructor default.
  - Visto tendrá false por defecto.
  - Métodos get de todos los atributos, excepto visto.
 - Métodos set de todos los atributos, excepto visto.
 - Sobreescribe el método toString.
 
3. En principio, las clases anteriores no son padre-hija, pero sí tienen atributos en común. Realiza el análisis correcto e impleméntalo para tener un óptimo resultado.

4. Crea una interfaz llamada Visualizable con los siguientes métodos:
- marcarVisto() cambia el atributo de visto a true.
- esVisto() devuelve el estado del atributo visto.
- tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.

5. Ahora crea una clase ejecutable y realiza lo siguiente:
-  Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.
- Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores.
- Marca en visto algunas Películas y Series con el método marcarVisto()
- Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.
- Por último, indica la serie con más temporadas y la película del año más reciente. Muéstralos en pantalla con toda su información (usa el método toString()).
