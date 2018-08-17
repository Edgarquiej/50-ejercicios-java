//Joptionpanel
package practica15;

//introducir datos por JOptionPanel
import javax.swing.*;
public class Practica15 {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=JOptionPane.showInputDialog("Introducir el Nombre: ");
        String edad=JOptionPane.showInputDialog("Intruduce la edad: ");
        int edadu=Integer.parseInt(edad);
        System.out.println("Tu nombre es: "+nombre+" y tu edad el siguiente año sera: "+(edadu+1)+" años");
    }
    
}
