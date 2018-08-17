//bucles
package practica21;

//bucles indeterminado

import javax.swing.JOptionPane;

public class Practica21 {

    public static void main(String[] args) {
        // TODO code application logic here
        String genero = "";
        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero (M/H)");
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
         int altura=Integer.parseInt(JOptionPane.showInputDialog("Introducir la altura en cm"));
         int pesoi=0;
         if(genero.equalsIgnoreCase("H")){
             pesoi=altura-110;
         }else if(genero.equalsIgnoreCase("M")){
             pesoi=altura-120;
         }
         System.out.println("El peso ideal es; "+pesoi);
    }
    
}
