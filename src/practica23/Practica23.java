//bucle for
package practica23;

import javax.swing.JOptionPane;

public class Practica23 {

    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=1;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        for(int s=numero; s>0; s--){
            resultado=resultado*s;
        }
        System.out.println("El factorial del numero "+numero+" es "+resultado);
    }
    
}
