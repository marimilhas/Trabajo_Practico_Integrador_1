import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ObtenerNombreEquipos {
    //Funciones para obtener el nombre de los equipos como un String
    public String equipos(String deEquipo, int cualEquipo) throws IOException {

        int i = 0;
        String resultadoEquipo = "";
        boolean finalizar = false;

        if (deEquipo == "equipo1" && cualEquipo == 1) {
            String equipo1 = this.buscarResultado("equipo1");

            while (i < equipo1.length() && finalizar == false){
                if (equipo1.charAt(i) != ';'){
                    resultadoEquipo += equipo1.charAt(i);
                }
                else{
                    finalizar = true;
                }

                i++;
            }

        }

        else if (deEquipo == "equipo1" && cualEquipo == 2) {
            String equipo1 = this.buscarResultado("equipo1");
            int cont = 0;

            while (i < equipo1.length() && finalizar == false){
                if (equipo1.charAt(i) == ';' && cont < 4){
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
        String archivo = "C:\\Users\\Franco\\Desktop\\Desarrollador Java\\TP-Integrador\\Trabajo_Practico_Integrador\\resultados\\resultados.csv";

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

