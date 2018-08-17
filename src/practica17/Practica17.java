//utilizacion del if
package practica17;

//condicionales

import java.util.Scanner;

public class Practica17 {

    //menu principal
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        
        System.out.println("Escribir tu edad: ");
        int edad=a.nextInt();
        /*if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/
        if(edad<18){
            System.out.println("Eres adolecente");
        }else if(edad<40){
            System.out.println("Eres joven");
        }else if(edad<65){
            System.out.println("Eres adulto");
        }else{
            System.out.println("cuidate");
        }
        
    }
    
}
