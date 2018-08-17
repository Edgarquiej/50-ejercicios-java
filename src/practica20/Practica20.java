//bucle
package practica20;

//bucle indeterminados

import java.util.Scanner;

public class Practica20 {

    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio=(int)(Math.random()*100);
        Scanner a= new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introducir el numero: ");
            numero=a.nextInt();
            if(aleatorio<numero){
                System.out.println("el numero es mas bajo: ");
            }
            if(aleatorio>numero){
                System.out.println("el numero es mas alto: ");
            }
        }
        System.out.println("Correcto, lo has conseguido "+intentos+" intentos");
            
    }
    
}
