package edu.estatuas.domain.estacion;
import edu.estatuas.domain.estacion.Anclaje;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = "";
        this.numeroAnclajes=numeroAnclajes;
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int numeroAnclajes() {
        return this.numeroAnclajes;
    }

    public String toString() {
       return "Estacion [id=" + getId() + ", direccion=" + getDireccion() + "numero de anclajes=" + numeroAnclajes() + "]";
    }

    public void ConsultarEstacion(String direccion) {
        /*system.out.println();*/
    }

    public int anclajesLibres() {
     return this.numeroAnclajes;
    }

   // public void anclarBicicleta(Movil) {
        int posicion = 0;
        int numeroAnclajes = posicion + 1;

        for(Anclaje anclaje: anclajes()) {
            if(anclaje.isOcupado()) {
                anclajes.ocuparAnclaje(posicion, bici);
                mostrarAnclaje(bici, numeroAnclaje);
                break;
            } else { posicion ++;
        }
    } numeroAnclaje++

}
