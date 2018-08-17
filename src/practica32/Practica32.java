//herencia
package practica32;

public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        coche a=new coche();
        a.colore("azul");
        furgoneta e= new furgoneta(7,580);
        e.colore("Azul");
        e.acientos("si");
        e.climatizador("si");
        
        System.out.println(a.ruedas()+ " "+a.colores());
        System.out.println(e.ruedas()+ " "+e.datofurgoneta());
    }
    
}
