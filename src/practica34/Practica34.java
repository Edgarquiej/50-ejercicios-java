//adtractos
package practica34;

import java.util.Date;
import java.util.GregorianCalendar;

public class Practica34 {

    public static void main(String[] args) {
        // TODO code application logic here
        personas p[]=new personas[2];
        p[0]=new Empleado("Luis conde",5000,2009,02,25);
        p[1]=new alumno("Ana Lopez","biologia");
        
        for(personas e: p){
            System.out.println(e.dnombre()+","+e.descripcion());
        }
    }
    
}
abstract class personas{
    public personas(String nom){
    nombre=nom;
    }
    public String dnombre(){
        return nombre;
    }
    public abstract String descripcion();
    private String nombre;
}

class Empleado extends personas{
    public Empleado(String nomb, double suel, int agno, int mes, int dia){
        super(nomb);
        sueldo=suel;
        GregorianCalendar cale = new GregorianCalendar(agno, mes-1,dia);
        altacontrato=cale.getTime();
        ++ids;
        id=ids;
    }
    public String descripcion(){
        return " Este empleado tiene el id "+ id + " con un sueldo de "+ sueldo;
    }
    public double sueldoa(){
        return sueldo;
    }
    public Date fechac(){
        return altacontrato;
    }
    public void sueldos(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
    private double sueldo;
    private Date altacontrato;
    private int id;
    private static int ids;
   
}

class alumno extends personas{
    public alumno(String nomb, String car){
        super(nomb); 
        carrera=car;
    }
     public String descripcion(){
        return " Este alumno esta estudiando la carrera "+ carrera;
    }
     private String carrera;
}
