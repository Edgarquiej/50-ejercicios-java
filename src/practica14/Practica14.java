//scaner para entrade datos
package practica14;

//entrada de datos

import java.util.Scanner;


public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducin tu nombre porfavor: ");
        String nombre = entrada.nextLine();
        System.out.println("Introducin tu edad: ");
        int edad= entrada.nextInt();
        System.out.println("Tu nombre es: "+nombre+" y tu edad el siguiente año sera: "+(edad+1)+" años");
        
    }
    
}
