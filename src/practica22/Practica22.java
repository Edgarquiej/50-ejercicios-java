//bucles
package practica22;

//bucles determinados

import javax.swing.JOptionPane;

public class Practica22 {

    public static void main(String[] args) {
        // TODO code application logic 
        /*for(int i=0;i<10;i++){
            System.out.println("Juan");
        */
        int arroba =0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("Introducir el email");
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                punto=true;
            }
        }
        if(arroba==1 && punto==true){
            System.out.println("Es correcto");
        }else{
            System.out.println("Es incorrecto");
        }
    }
    
}
