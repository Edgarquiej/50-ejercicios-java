//practica numero 29
package practica30;

//contantes
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado trab=new Empleado("Paco");
        Empleado trab2=new Empleado("Ana");
        trab.cambiaSeccion("Recurso humanos");
        System.out.println(trab.devuelvedato());
        System.out.println(trab2.devuelvedato());
        System.out.println(Empleado.idsiguiente());
    }
    
}
class Empleado{
    
    public Empleado(String nom){
        nombre=nom;
        seccion="Administrador";
        id=ide;
        ide++;
    }
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    /*public void cambianombre(String nombre){
        this.nombre=nombre;
    }*/
    public String devuelvedato(){
        return "el nombre es "+ nombre +" y la seccion es "+ seccion+ " y el ID: "+ id;
    }
    public static String idsiguiente(){
        return " El id siguiente es "+ide;
    }
    private final String nombre;
    private String seccion;
    private int id;
    private static int ide=1;
}