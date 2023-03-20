import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    String nro;
    Partido partidos;

    public Ronda(Partido partidos, int golesEquipo1, int golesEquipo2){
        this.partidos = partidos;
    }

    public String puntos(String deEquipo) throws IOException {

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
        else{
            return results.get(1);
        }

    }

}
