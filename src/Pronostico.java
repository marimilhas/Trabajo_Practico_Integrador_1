import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pronostico {
    private Partido partido;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido) {
        this.partido = partido;
    }


    public int pronosticoDeEquipo(String deEquipo) throws IOException {

        int i = 0;
        char resultadoEquipo = '3';
        boolean finalizar = false;

        if (deEquipo == "equipo1") {

            String equipo1 = this.buscarPronostico("equipo1");

            while (i < equipo1.length() && finalizar == false) {
                if (equipo1.charAt(i) == ';' && equipo1.charAt(i + 1) == 'X') {
                    resultadoEquipo = '1';
                    finalizar = true;
                }

                else if (equipo1.charAt(i) == ';' && equipo1.charAt(i + 3) == 'X') {
                    resultadoEquipo = '2';
                    finalizar = true;
                }
                else if(equipo1.charAt(i) == ';' && equipo1.charAt(i + 2) == 'X') {
                    resultadoEquipo = '3';
                    finalizar = true;
                }

                i++;
            }
        }

        if (deEquipo == "equipo2") {
            String equipo2 = this.buscarPronostico("equipo2");

            while (i < equipo2.length() && finalizar == false) {
                if (equipo2.charAt(i) == ';' && equipo2.charAt(i + 1) == 'X') {
                    resultadoEquipo = '1';
                    finalizar = true;
                }

                else if (equipo2.charAt(i) == ';' && equipo2.charAt(i + 3) == 'X') {
                    resultadoEquipo = '2';
                    finalizar = true;
                }

                else if(equipo2.charAt(i) == ';' && equipo2.charAt(i + 2) == 'X') {
                    resultadoEquipo = '3';
                    finalizar = true;
                }

                i++;
            }

            while (i < equipo2.length() && finalizar == false) {

                i++;
            }
        }


        return Character.getNumericValue(resultadoEquipo);
    }

    public String buscarPronostico(String deEquipo) throws IOException {

        List<String> results = new ArrayList<>();
        String archivo = "C:\\Users\\Franco\\Desktop\\Desarrollador Java\\TP-Integrador\\Trabajo_Practico_Integrador\\pronosticos\\pronosticos.csv";

        for (String linea : Files.readAllLines(Paths.get(archivo))) {

            results.add(linea);
        }

        if (deEquipo == "equipo1") {

            return results.get(0);
        } else {
            return results.get(1);
        }
    }
}