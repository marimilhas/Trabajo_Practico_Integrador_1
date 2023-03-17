public class Ronda {
    String nro;
    Partido partidos;

    public Ronda(Partido partidos, int golesEquipo1, int golesEquipo2){
        this.partidos = partidos;
    }

    public void puntos(){
        return; // este metodo tiene que ser un void, pero me salta error si le pongo int sin devolver algo.
    }
}
