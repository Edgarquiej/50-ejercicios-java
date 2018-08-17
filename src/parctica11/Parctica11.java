 //practica de string
package parctica11;

//manipulacion de cadenas de tipo string
public class Parctica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="Hoy es un estupendo dia para aprender a programar en java";
        //String resumenf=frase.substring(29, 57);
        
        String resumenf=frase.substring(0, 29) + "irnos a la playa y olvidar todo...";
        System.out.println("la frase es: "+ resumenf);
    }
    
}
