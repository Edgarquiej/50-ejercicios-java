
package practica36;

import java.util.Scanner;

public class Practica36 {
//enum talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
    enum Talla{
        MINI("s"),MEDIANO("m"),GRANDE("l"),MUY_GRANDE("xl");
        private Talla(String abrebiatura){
            this.abrebiatura=abrebiatura;
        }
        public String dabrebiatura(){
            return abrebiatura;
        }
        private String abrebiatura;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /*talla s=talla.MINI;
        talla m=talla.MEDIANO;
        talla l=talla.GRANDE;
        talla xl=talla.MUY_GRANDE;*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribir una talla: Mini, Mediano, Grande, Muy grande");
        String entrad=entrada.next().toUpperCase();
        Talla t=Enum.valueOf(Talla.class, entrad);
        System.out.println("la talla = "+t);
        System.out.println("Abrebiatura = "+t.dabrebiatura());
    }
    
    
}
