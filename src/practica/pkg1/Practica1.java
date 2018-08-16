//practicas de java
package practica.pkg1;

import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Bienvenido a Programacion");
        System.out.println(" Practicas\n de\n JAVA");
        Scanner entrada = new Scanner(System.in);
        int nume1,numer2;
        int result;
        System.out.println("Escribir los numeros a sumar");
        nume1 = entrada.nextInt();
        System.out.println("Escribir el numero dos");
        numer2 = entrada.nextInt();
        result = nume1+numer2;
        System.out.printf("La suma es %d\n",result);
    }
    
}
