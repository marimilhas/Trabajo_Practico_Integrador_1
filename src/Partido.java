public class Partido {
    private int golesEquipo1;
    private int golesEquipo2;
    public String ResultadoEnum(){
        if (golesEquipo1 > golesEquipo2){
            return "Gana_equipo1";
        } else if (golesEquipo1 < golesEquipo2){
            return "Gana_equipo2";
        } else{
            return "Empate";
        }
    }
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
    }
}