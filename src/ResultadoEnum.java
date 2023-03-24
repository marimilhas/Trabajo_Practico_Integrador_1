import java.io.IOException;

public class ResultadoEnum {
    public void resultado(int golesEquipo1, int golesEquipo2, int pronosticoEquipo1) {

        if (golesEquipo1 > golesEquipo2 && pronosticoEquipo1 == 1) {
            System.out.println("Ganó el equipo 1, acertaste!");

        }
        else if (golesEquipo2 > golesEquipo1 && pronosticoEquipo1 == 2) {
            System.out.println("Ganó el equipo 2, acertaste!");
        }
        else if (golesEquipo1 == golesEquipo2){
            System.out.println("Empataron, acertaste!");
        }

        else {
            System.out.println("No has podido acertar");
        }
    }
}

