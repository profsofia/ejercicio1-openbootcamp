package com.openbootcamp;

public class EjercicioDos {
    public static void main(String[] args) {
        /*
        * Para este ejercicio tendréis que crear una función que reciba
        * un precio y devuelva el precio con el IVA incluido.*/
        double resultadoProducto = obtenerPrecioConIva(23);
        System.out.println(resultadoProducto);
    }
   static double obtenerPrecioConIva(double precio){
        return precio*1.21;
    }
}
