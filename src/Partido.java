public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(String nombre1, String nombre2, String descripcion1,  String descripcion2){
        equipo1 = new Equipo(nombre1, descripcion1);
        equipo2 = new Equipo(nombre2, descripcion2);
    }

    //Aún falta implementar el método resultado..

}
