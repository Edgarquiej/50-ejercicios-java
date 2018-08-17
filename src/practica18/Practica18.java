//estructura swigt
package practica18;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica18 {

    //menu principal
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.println("Elegir una opcion: \n1: cuadrado \n2: rectagulo \n3: triangulo \n4: circulo");
        int figura=a.nextInt();
        switch(figura){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area de un cuadrado es: "+Math.pow(lado, 2)); 
            break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
                System.out.println("El area del rectangulo es: "+base*altura);
            break;
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
                altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
                System.out.println("El area del triangulo es: "+(base*altura)/2);
            break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.println("El area del circulo es: ");
                 System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
            break;
            default:
                 System.out.println("Ls opcion no es correcta: ");
            
        }
    }
    
}
