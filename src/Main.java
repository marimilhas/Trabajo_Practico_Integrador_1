import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRONÓSTICOS DEPORTIVOS");

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Desea jugar una ronda?");
        String opcion = entrada.nextLine();
        int contador = 0;

        while(opcion.contains("Ss") ){
            contador += 1;
            Ronda ronda = new Ronda();
            ronda.setNro(contador);
        }
    }
}
