package edu.estatuas.domain.estacion;

class Anclaje {

    private boolean ocupado = false;
    private Movil bici = null;

    Anclaje() {}
    boolean isOcupado(){
        return this.ocupado;
    }

    Movil getBici() { return this.bici; }

    void anclarBici() { this.bici = bici;
    this.ocupado = true; }

    void liberarBici() {this.bici = null;
    this.ocupado = false;}

    @Override
    public String toString() {
        return "Número de anclajes" + Boolean.toString(isOcupado());
    }








}