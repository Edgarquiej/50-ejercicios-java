//cadenas tipo string
package practica10;

//estructuras de cadenas(manipulacion)
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="juan lucas paz Garcia";
        
        System.out.println("Mi nombre es: "+ nombre);
        System.out.println("el numero de letras: "+ nombre.length());
        System.out.println("La primera letra de mi nombre es: "+nombre.charAt(0));
        int ultimo;
        ultimo=nombre.length();
        System.out.println("Escribir la ultima letra: "+nombre.charAt(ultimo-1));
    }
    
}
