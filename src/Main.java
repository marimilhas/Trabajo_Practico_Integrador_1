public class Main {
    public static void main(String[] args) {

        Partido partido = new Partido("nombre de equipo 1", "nombre de equipo 2", "descripcion de equip1", "descripcion de equip2");
        Pronostico pronostico = new Pronostico(partido);
        Ronda ronda = new Ronda(partido, 1, 2);

        //Falta desarrollar resultadoEnum
    }
}