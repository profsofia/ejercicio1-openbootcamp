package com.clases;


//reloj inteligente
public class SmartWatch extends SmartDevice{
    int frecuenciaCardiaca;
    int presion;
    int contadorPasos;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, int porcentajeBateria, double precio, String tipoSistema, int frecuenciaCardiaca, int presion, int contadorPasos) {
        super(modelo, porcentajeBateria, precio, tipoSistema);
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presion = presion;
        this.contadorPasos = contadorPasos;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", presion=" + presion +
                ", contadorPasos=" + contadorPasos +
                ", modelo='" + modelo + '\'' +
                ", porcentajeBateria=" + porcentajeBateria +
                ", precio=" + precio +
                ", tipoSistema='" + tipoSistema + '\'' +
                '}';
    }
}
