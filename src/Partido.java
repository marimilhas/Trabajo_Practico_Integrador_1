public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(String nombre1, String nombre2, String descripcion1,  String descripcion2){
        equipo1 = new Equipo(nombre1, nombre2, descripcion1, descripcion2);
    }
    /*
    public void crearPartido(String nombre1, String nombre2, String descripcion1,  String descripcion2){
        equipo1 = new Equipo(nombre1, descripcion1);
        equipo2 = new Equipo(nombre2, descripcion2);
        }
     */

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    //Aún falta implementar el método resultado..



}
