//areglos
package practica25;
//matriz

import javax.swing.JOptionPane;

public class Practica25 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*String paises[]=new String[8];
        paises[0]="España";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Peru";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venesuela";
        
        for(int i=0; i<paises.length;i++){
            System.out.println(" Pais "+(i+1)+" "+paises[i]);
        }
        for(int q=0; q <paises.length;q++){
            paises[q]=JOptionPane.showInputDialog("Escribir nombre de paises"+(q+1));
        }
        
        for(String pais:paises){
            System.out.println("pais "+pais);
        }*/
        
        int numeroa[]=new int[150];
        for(int i=0;i<numeroa.length;i++){
            numeroa[i]=(int)Math.round(Math.random()*100);
        }
        for(int n:numeroa){
            System.out.print(n+" ");
        }
    }
    
}
