package com.clases;



//teléfono inteligente
public class SmartPhone extends SmartDevice{
    boolean descargarJuegos = true;
    int memoria;
    String empresaTelefonica;
    boolean linterna;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, int porcentajeBateria, double precio, String tipoSistema, boolean descargarJuegos, int memoria, String empresaTelefonica, boolean linterna) {
        super(modelo, porcentajeBateria, precio, tipoSistema);
        this.descargarJuegos = descargarJuegos;
        this.memoria = memoria;
        this.empresaTelefonica = empresaTelefonica;
        this.linterna = linterna;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "descargarJuegos=" + descargarJuegos +
                ", memoria=" + memoria +
                ", empresaTelefonica='" + empresaTelefonica + '\'' +
                ", linterna=" + linterna +
                ", modelo='" + modelo + '\'' +
                ", porcentajeBateria=" + porcentajeBateria +
                ", precio=" + precio +
                ", tipoSistema='" + tipoSistema + '\'' +
                '}';
    }
}
