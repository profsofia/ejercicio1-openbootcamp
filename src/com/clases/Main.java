package com.clases;

public class Main {
    public static void main(String[] args) {
     //creamos objeto teléfono inteligente..
        SmartPhone samsung = new SmartPhone("samsungA4", 90, 10000, "android", true, 4, "claro", true);

        //imprimimos su valor
        System.out.println(samsung.toString());
        //cargamos tres horas la bateria
        samsung.cargarBateria(3);
        System.out.println(samsung.porcentajeBateria);

        /////////////////// objeto vacio para luego asignar los valores...
        SmartWatch xiaomi = new SmartWatch();

        xiaomi.modelo = "XiaomiA5";
        xiaomi.contadorPasos = 0;
        xiaomi.porcentajeBateria = 30;
        xiaomi.precio= 100;
        xiaomi.tipoSistema = "Apple";
        //objeto con valores
        System.out.println(xiaomi.toString());

    }
}
