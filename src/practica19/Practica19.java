//bucles
package practica19;

//bucles indeteminados

import javax.swing.JOptionPane;

public class Practica19 {

    public static void main(String[] args) {
        // TODO code application logic here
        String clave="juan";
        String pass="";
        
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("introducir la contraseña");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }   
        }
        System.out.println("Contraseña correcta. Acceso Permitido");
    }
    
}
