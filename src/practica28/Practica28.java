//programacion POO
package practica28;

import javax.swing.JOptionPane;

public class Practica28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        coche a =new coche();        
        System.out.println(a.ruedas());
        a.colore(JOptionPane.showInputDialog("Introduce color "));
        System.out.println(a.colores());
        a.acientos(JOptionPane.showInputDialog("Tiene acientos de cuero"));
        System.out.println(a.acientosv());
        a.climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
        System.out.println(a.climatizarv());
        System.out.println(a.pesototal());
        System.out.println("El precio de coche "+a.precioc());
    }
    
}
