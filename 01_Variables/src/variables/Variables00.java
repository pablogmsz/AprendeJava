/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author linkl
 */
public class Variables00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        "VARIABLES"
        
        Las variables son contenedores en los que se puede almacenar
        información, que actúan de una forma u de otra dependiendo del
        valor que contengan.
        
        Para declarar una variable hay que especificar el tipo de
        variable que es y asignarle un nombre a dicha variable.
        Podemos hacerlo en pasos separados:
        "int x;"   [A esto se le denomina Declaración].
        "x = 123;" [A esto se le denomina Asignación].
        
        O hacerlo todo a la vez:
        "int x = 123;" [A esto se le denomina Inicialización].
        */
        
        /*
        En este archivo veremos los siguientes:
        
        Enteros ("int"): Es un tipo de dato que contiene números enteros 
        que van desde -2000.000.000 hasta 2000.000.000. Tiene un tamaño
        de 4 bytes y es de tipo primitivo. Un ejemplo:
        */
        int x = 123;
        System.out.println("Aquí saldrá un número natural: " + x);

        /*
        Dobles ("double"): Es un tipo de dato que contiene números decimales
        que va hasta 15 decimales. Tiene un tamaño de 8 bytes y es de tipo
        primitivo. Un ejemplo:
        */
        double y = 3.141592653589793;
        System.out.println("Aquí saldrá un número decimal: " + y);

        /*
        Caracter ("char"): Es un tipo de variable que contiene únicamente
        un caracter, para expresarlo es con las comillas simples (''). Tiene
        un tamaño de 2 bytes y es de tipo primitivo. Un ejemplo:
        */
        char caracter = '@';
        System.out.println("Aquí saldrá un caracter: " + caracter);

        /*
        Cadena ("String"): Es un tipo de variable que contiene cadenas de 
        caracteres. El tamaño es variable y es de tipo referencia.
        */
        String nombre = "Pablo";
        System.out.println("Hola " + nombre);

        /*
        Booleanos ("boolean"): Es un tipo de dato que solo distingue
        entre verdadero o falso ("true" o "false"). Tiene un tamaño de
        1 bit y es de tipo primitivo. Un ejemplo:
        */
        boolean verdadero = true;
        System.out.println("Aquí saldrá verdadero: " + verdadero);

        boolean falso = false;
        System.out.println("Aquí saldrá falso: " + falso);

        /*
        También están los siguientes tipos de variables:
        "byte", "short", "long" y "float".
        Todos ellos son primitivos y los 3 primeros sirven para números
        enteros, mientras que "float" es para números decimales. No los
        explico porque para nosotros que estamos empezando no son necesarios.
        Si los llegamos a precisar en algún momento se explicará su uso.
        */
        
        /*
        "PRIMITIVO Vs REFERENCIAS"
        
        Los tipos de variables primitivas son solamente 8 tipos, mientras que 
        las referencias son ilimitadas ya que las define el usuario. Los tipos
        primitivos almacenan datos y las referencias almacenan direcciones.
        Por otro lado, los primitivos solamente pueden contener 1 valor, 
        mientras que las referencias pueden contener más de 1. En cuanto a la
        memoria, los primitivos usan menos que las referencias.
        */
    }

}
