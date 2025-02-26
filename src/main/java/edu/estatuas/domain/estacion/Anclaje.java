package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Bicicleta;

class Anclaje {

    private boolean ocupado = false;
    private Bicicleta bici = null;

    Anclaje() {}
    boolean isOcupado(){
        return this.ocupado;
    }

    Bicicleta getBici() { return this.bici; }

    void anclarBici() { this.bici = bici;
    this.ocupado = true; }

    void liberarBici() {this.bici = null;
    this.ocupado = false;}

    @Override
    public String toString() {
        return "Número de anclajes" + Boolean.toString(isOcupado());
    }
}