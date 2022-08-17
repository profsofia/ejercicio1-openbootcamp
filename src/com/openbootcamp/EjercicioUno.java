package com.openbootcamp;

public class EjercicioUno {
    /*
    * atajo para crear el método de arranque
    * main
    * Para este primer ejercicio tendréis que realizar lo siguiente:

   Crea un proyecto de Java desde 0

Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
    * */
    public static void main(String[] args) {
        //tipos de datos
        String nombre = "Sofía";
        int edad = 29;
        long dni =123456789;
        double altura = 1.60d;
        boolean trabajo= false;
        System.out.println("Mi nombre es "+ nombre+ "Tengo "+ edad+ "años, mi DNI es: "+ dni+
                "mido: "+ altura + "centímetros, ¿Trabajo? "+ trabajo);

    }
}
