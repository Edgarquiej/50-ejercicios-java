//entrade de double
package practica16;

import javax.swing.JOptionPane;


public class Practica16 {
    public static void main(String[] args) {
        // TODO code application logic here
        String num1=JOptionPane.showInputDialog("Introducir numero: ");
        double num2=Double.parseDouble(num1);
        System.out.println("la raiz de "+num1+" es ");
        System.out.printf("%1.2f",Math.sqrt(num2));
        System.out.println();
    }
    
}
