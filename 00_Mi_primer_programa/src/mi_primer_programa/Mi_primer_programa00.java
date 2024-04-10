/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi_primer_programa;

/**
 *
 * @author linkl
 */
public class Mi_primer_programa00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        El resto de líneas que hay encima de este comentario explicaremos lo
        que es mucho más adelante. Ahora lo principal es aprender lo básico.
        */
        
        // Esto es un comentario de una línea.
        // Los comentarios no aparecen ni influyen en el código escrito.
        
        /* (Puedes escribir aquí).
        Esto es un comentario de "x" líneas.
        Los comentarios no se pueden concatenar.
        (Y aquí también, pero no es muy estético a la vista).*/ 
        
        // Toda línea de código que escribas debe acabar en un ";"
        
        /* 
        El método "print" es el que hace que aparezca texto en pantalla
        o también conocido como "Output". El método "println" la única 
        diferencia que hay es que le añade un salto de línea a la línea de
        código que hemos escrito.
        */
        System.out.println("Texto de ejemplo 1.");
        
        /* 
        Puedes escribir "sout" y seguidamente presionas el tabulador
        para poner automáticamente "System..", si no sería muy tedioso
        hacerlo a mano.
        */
        System.out.println("Texto de ejemplo 2.");
        
        /* 
        "ESCAPE SEQUENCES"
        
        Son una serie de caracteres especiales que podemos usar en 
        (normalmente) cualquier IDE, estos se usan porque hay ciertas
        palabras que son de uso restringido porque el propio IDE los
        usa para ciertas tareas. Por ejemplo, las comillas dobles (""),
        estas se usan para indicar que estás escribiendo una cadena de
        caracteres que aparecerán en el "Output" al compilar el programa.
        */
        
        /*
        Para escribir estos caracteres especiales solo hay que poner un "\"
        seguido del caracter deseado. Un ejemplo usando (""):
        */
        System.out.println("\"Texto de ejemplo 3\".");
        
        /*
        Usando "\n" podemos hacer un salto de línea como si estuviesemos
        usando un "println".
        Ejemplo:
        */
        System.out.print("Texto de ejemplo 4.\n");
        
        /*
        Usando "\t" podemos tabular el código hacia una dirección
        dependiendo del sitio donde lo coloquemos. Normalmente se pone 
        en la izquierda, ya que si lo ponemos a la derecha no tendría
        sentido debido a que ya empezamos en el lado izquierdo escribiendo.
        Ejemplo:
        */
        System.out.println("\tTexto de ejemplo 5.");
        
        // En este no tabulará por lo dicho antes.
        System.out.println("Texto de ejemplo 6.\t");
        
        /*
        Usando "\\" podrás poner una "\".
        Ejemplo:
        */
        System.out.println("\\Texto de ejemplo 7.\\");
        
        /*
        El resto de ellos los iremos viendo a lo largo de estos archivos
        o podéis buscarlo directamente en internet.
        */
    }
    
}
