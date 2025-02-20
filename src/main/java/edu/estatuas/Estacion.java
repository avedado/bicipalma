package edu.estatuas;

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

    @Override
    public String toString() {
       return "Estacion [id=" + getId() + ", direccion=" + getDireccion() + "numero de anclajes=" + numeroAnclajes() + "]";
    }

    public void ConsultarEstacion(String direccion) {
        /*system.out.println();*/
    }




}
