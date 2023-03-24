public class Ronda {
    //private String nro;
    private Partido[] partidos;

    public Ronda(Partido[] partidos){
        this.partidos = partidos;
    }
    public int obtener_puntaje(int cantidad_partidos, Pronostico[] pronosticos){
        int puntaje = 0;
        for (int i = 0; i < cantidad_partidos; i++){
            String resultado_pronostico = pronosticos[i].resultado;
            String resultado_partido = Funciones.calcular_resultado_partido(partidos[i]);
            if (resultado_pronostico.equals(resultado_partido)){
                puntaje += 1;
            }
        }
        return puntaje;
    }
}