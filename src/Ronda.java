import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    String nro;
    Partido partidos;

    public Ronda(Partido partidos) throws IOException {
        this.partidos = partidos;
    }

    public void setGoles(int goles1, int goles2){
        partidos.setGolesEquipo1(goles1);
        partidos.setGolesEquipo1(goles2);
    }


    public int puntos(String deEquipo, int cualEquipo) throws IOException {

        int i = 0;
        char resultadoEquipo = 't';
        boolean finalizar = false;

        if (deEquipo == "equipo1" && cualEquipo == 1) {
            String equipo1 = this.buscarResultado("equipo1");

            while (i < equipo1.length() && finalizar == false){
                if (equipo1.charAt(i) >= '0' && equipo1.charAt(i) <= '9') {
                    resultadoEquipo = equipo1.charAt(i);
                    finalizar = true;
                }
                i++;
            }

        }

        else if (deEquipo == "equipo1" && cualEquipo == 2) {
            String equipo1 = this.buscarResultado("equipo1");

            while (i < equipo1.length() && finalizar == false){
                if (equipo1.charAt(i) >= '0' && equipo1.charAt(i) <= '9') {
                    resultadoEquipo = equipo1.charAt(i+2);
                    finalizar = true;
                }
                i++;
            }

        }

        else if (deEquipo == "equipo2" && cualEquipo == 1) {
            String equipo2 = this.buscarResultado("equipo2");

            while (i < equipo2.length() && finalizar == false){
                if (equipo2.charAt(i) >= '0' && equipo2.charAt(i) <= '9') {
                    resultadoEquipo = equipo2.charAt(i);
                    finalizar = true;
                }
                i++;
            }
        }

        else if (deEquipo == "equipo2" && cualEquipo == 2) {
            String equipo2 = this.buscarResultado("equipo2");

            while (i < equipo2.length() && finalizar == false){
                if (equipo2.charAt(i) >= '0' && equipo2.charAt(i) <= '9') {
                    resultadoEquipo = equipo2.charAt(i);
                    finalizar = true;
                }
                i++;
            }
        }


        return Character.getNumericValue(resultadoEquipo);
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
