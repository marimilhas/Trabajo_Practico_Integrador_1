import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //Creo el partido de Argentina vs Arabia Saudita
        Partido partido = new Partido(equipos("equipo1", 1), equipos("equipo1", 2), "equipo 1", "equipo 2");

        //Creo el pronostico para pasarle los pronósticos a ResultadoEnum
        Pronostico pronostico = new Pronostico(partido);
        //.. Aún falta hacer ResultadoEnum

        //Creo una ronda con el partido Argentina vs Arabia Saudita
        Ronda ronda = new Ronda(partido);

        //Le paso los goles de Ronda a las propiedades golesEquipo1 y golesEquipo2 que están en Partido
        ronda.setGoles(ronda.puntos("equipo1", 1), ronda.puntos("equipo1", 2));

        //Creo ResultadoEnum, debería recibir los pronósticos, los resultados y devolver si acertó o no
        ResultadoEnum resultados = new ResultadoEnum();

        //Esta es la funcion que muestra si se acertó o no, falta desarrollar
        resultados.resultado(pronostico.buscarPronostico("equipo1"), pronostico.buscarPronostico("equipo2"), ronda.buscarResultado("equipo1"), ronda.buscarResultado("equipo2"));


    }

    //Funciones para obtener el nombre de los equipos como un String
    public static String equipos(String deEquipo, int cualEquipo) throws IOException {

        int i = 0;
        String resultadoEquipo = "";
        boolean finalizar = false;

        if (deEquipo == "equipo1" && cualEquipo == 1) {
            String equipo1 = this.buscarResultado("equipo1");

            while (i < equipo1.length() && finalizar == false){
                if (!(equipo1.charAt(i) >= '0' && equipo1.charAt(i) <= '9')) {
                    if (equipo1.charAt(i) != ';'){
                        resultadoEquipo += equipo1.charAt(i);
                    }
                    else{
                        finalizar = true;
                    }
                }
                i++;
            }

        }

        else if (deEquipo == "equipo1" && cualEquipo == 2) {
            String equipo1 = this.buscarResultado("equipo1");
            int cont = 0;

            while (i < equipo1.length() && finalizar == false){
                if (equipo1.charAt(i) == ';' && cont < 3){
                    cont++;
                }
                else{
                    resultadoEquipo += equipo1.charAt(i);
                }
                i++;
            }

        }

        else if (deEquipo == "equipo2" && cualEquipo == 1) {
            String equipo2 = this.buscarResultado("equipo2");

            while (i < equipo2.length() && finalizar == false){
                if (!(equipo2.charAt(i) >= '0' && equipo2.charAt(i) <= '9')) {
                    if (equipo2.charAt(i) != ';'){
                        resultadoEquipo += equipo2.charAt(i);
                    }
                    else{
                        finalizar = true;
                    }
                }
                i++;
            }
        }

        else if (deEquipo == "equipo2" && cualEquipo == 2) {
            String equipo2 = this.buscarResultado("equipo2");
            int cont = 0;

            while (i < equipo2.length() && finalizar == false){
                if (equipo2.charAt(i) == ';' && cont < 3){
                    cont++;
                }
                else{
                    resultadoEquipo += equipo2.charAt(i);
                }
                i++;
            }
        }


        return resultadoEquipo;
    }

    public String buscarResultado(String deEquipo) throws IOException {

        int i = 0;
        List<String> results = new ArrayList<>();
        String archivo = "C:\\Users\\Franco\\Desktop\\Desarrollador Java\\Trabajo-practico-Franco-Rivera\\TP\\resultados\\resultados.csv";

        for (String linea : Files.readAllLines(Paths.get(archivo))){

            results.add(linea);
            i++;
        }

        if (deEquipo == "equipo1"){
            return results.get(0);
        }
        else if(deEquipo == "equipo2"){
            return results.get(1);
        }
        else{
            return "Nada";
        }

    }
}