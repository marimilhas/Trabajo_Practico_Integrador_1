import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String equipo1;
    private String equipo2;
    private String descripcion1;
    private String descripcion2;

    public Equipo(String equipo1, String equipo2, String descripcion1, String descripcion2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
    }

    public String equipos(String deEquipo, int cualEquipo) throws IOException {

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
