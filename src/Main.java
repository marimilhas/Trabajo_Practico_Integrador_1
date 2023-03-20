import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Partido partido = new Partido("nombre de equipo 1", "nombre de equipo 2", "descripcion de equip1", "descripcion de equip2");
        Pronostico pronostico = new Pronostico(partido);
        Ronda ronda = new Ronda(partido, 1, 2);

        ResultadoEnum resultados = new ResultadoEnum();

        resultados.resultado(pronostico.buscarPronostico("equipo1"), pronostico.buscarPronostico("equipo2"), ronda.puntos("equipo1"), ronda.puntos("equipo2"));

    }
}