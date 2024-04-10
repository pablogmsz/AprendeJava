/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author linkl
 */
public class Cambiar_variables01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        "SWAP VARIABLES"
        
        Aquí vamos a ver de forma sencilla como intercambiar el valor de 2
        variables entre si.
        */
        
        // Creamos una variable. 
        String x = "123";

        // Creamos una 2º variable.
        String y = "Hola";

        /*
        Si tu intentas igualar las 2 variables:
        "x = y" o "y = x", estaríamos sustituyendo el valor de una de
        las variables por la otra.
        Entonces para conseguir el intercambio tendremos que hacerlo
        de otra forma. Si en el IDE que te encuentras no existe ninguna 
        función para intercambiar automáticamente los valores, tendrás que
        hacerlo tú de manera manual con una variable auxiliar. Ejemplo:
        */
        
        // Creamos la variable auxiliar.
        String auxiliar;

        // Ahora procedemos con el intercambio de valores.
        auxiliar = x;
        x = y;
        y = auxiliar;

        // Y ahora hacemos "print" a las variables.
        System.out.println("Ahora x es: " + x);
        System.out.println("Ahora y es: " + y);
    }

}
