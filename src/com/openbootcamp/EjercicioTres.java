package com.openbootcamp;

public class EjercicioTres {
    /*
    * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el
    *  resultado final por consola.
    * Tened en cuenta que los textos pueden venir
      * de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
    * */
    public static void main(String[] args) {
        String[] nombres ={"Santino", "Constantino", "Alejandro", "Lucas", "Martin", "Michael"};
        String nombresConcatenados = "";
                for(int i = 0; i < nombres.length; i++){
                    nombresConcatenados +=nombres[i] + " ";
                }
                System.out.println(nombresConcatenados);

    }
}
