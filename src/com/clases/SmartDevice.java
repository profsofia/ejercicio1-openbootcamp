package com.clases;

//Dispositivo inteligente
/*clase abstracta
* no tendía sentido que se crearan objetos de esta clase...
* */
public abstract class SmartDevice {
   protected String modelo;
    protected int porcentajeBateria;
    protected double precio;
    protected String tipoSistema;


    public SmartDevice() {
    }

    public SmartDevice(String modelo, int porcentajeBateria, double precio, String tipoSistema) {
        this.modelo = modelo;
        this.porcentajeBateria = porcentajeBateria;
        this.precio = precio;
        this.tipoSistema = tipoSistema;
    }

    //métodos
    public int cargarBateria(int tiempoEnHoras){
        return porcentajeBateria+=tiempoEnHoras;
    }


}
