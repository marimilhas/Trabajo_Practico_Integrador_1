import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pronostico {
    private Partido partido;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido){
        this.partido = partido;
    }



    public String buscarPronostico(String deEquipo) throws IOException {

        int i = 0;
        List<String> results = new ArrayList<>();
        String archivo = "C:\\Users\\Franco\\Desktop\\Desarrollador Java\\Trabajo-practico-Franco-Rivera\\TP\\pronosticos\\pronosticos.csv";

        for (String linea : Files.readAllLines(Paths.get(archivo))){

            results.add(linea);
            i++;
        }

        if (deEquipo == "equipo1"){

            return results.get(0);
        }
        else{
            return results.get(1);
        }

    }






}
