package edu.estatuas.domain.tarjetausuario;

public class TarjetaUsuario {

    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id) {
        this.id = id;
        this.activada = false;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean valor) {
        this.activada= valor;
    }

    public String toString() {
        return id;
    }

}
