import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //  CREO EL PRIMER PARTIDO
        //Creo la clase que obtiene nombre del equipo
        ObtenerNombreEquipos nombreDeEquipo = new ObtenerNombreEquipos();

        //Creo el partido de Argentina vs Arabia Saudita
        Partido partido1 = new Partido(nombreDeEquipo.equipos("equipo1", 1), nombreDeEquipo.equipos("equipo1", 2), "equipo 1", "equipo 2");

        //Creo el pronostico para pasarle los pronósticos a ResultadoEnum (Lo pasé al final del código)
        Pronostico pronostico = new Pronostico(partido1);

        //Creo una ronda con el partido Argentina vs Arabia Saudita
        Ronda ronda1 = new Ronda(partido1);

        //Le paso los goles de Ronda (Argentina vs Arabia Saudita) a las propiedades golesEquipo1 y golesEquipo2 que están en Partido
        ronda1.setGoles(ronda1.puntos("equipo1", 1), ronda1.puntos("equipo1", 2));

        //  CREO EL PARTIDO SIGUIENTE

        //Creo el partido de Polonia vs Mexico
        Partido partido2 = new Partido(nombreDeEquipo.equipos("equipo2", 1), nombreDeEquipo.equipos("equipo2", 2), "equipo 1", "equipo 2");

        //Creo una ronda con el partido Polonia vs Mexico
        Ronda ronda2 = new Ronda (partido2);

        //Le paso los goles de Ronda (Polonia vs Mexico) a las propiedades golesEquipo1 y golesEquipo2 que están en Partido
        ronda2.setGoles(ronda2.puntos("equipo2", 1), ronda2.puntos("equipo2", 2));

        //Creo ResultadoEnum como resultados para pasarle por el método resultado los goles y pronosticos
        ResultadoEnum resultados = new ResultadoEnum();

        //Esto se lee así, le paso por parámetro los goles de Argentina, de Arabia Saudita, y el pronostico de quién se cree que ganó.
        //Argentina 1 - 2 Arabia Saudita, pron
        resultados.resultado(partido1.getGolesEquipo1(), partido1.getGolesEquipo2(), pronostico.pronosticoDeEquipo("equipo1"));

        //Esto se lee así, le paso por parámetro los goles de Polonia, de México, y el pronostico de quién se cree que ganó.
        resultados.resultado(partido2.getGolesEquipo1(), partido2.getGolesEquipo2(), pronostico.pronosticoDeEquipo("equipo2"));

        //El método resultado devuelve si acertó tu pronostico con el resultado del partido, sino te dice que no has podido acertar
        //Si al tercer parámetro le pones un 1, se pronostica que gana el equipo 1, si es 2, se pronostica que gana el equipo 2
        //Y si le pones un 3 se pronostica que hubo empate
    }
}