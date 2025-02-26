package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Bicicleta;
import java.util.concurrent.ThreadLocalRandom;

class Anclajes {

    private final Anclaje[] anclajes

    Anclajes(int numeroAnclajes) {
        this.anclajes = new Anclaje[numeroAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < this.anclajes.length; i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numeroAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion, Bicicleta bicicleta) {
        this.anclajes[posicion].anclarBici();
    }

    boolean isAncalajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    Bicicleta getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    int seleccionarAnclaje() {
        Integer idAnclaje= ThreadLocalRandom.current().nextInt(0, numeroAnclajes());
        return idAnclaje;
    }

    @Override
    public String toString(){
        return "Anclajes: " + Integer.toString(numeroAnclajes());
    }
}