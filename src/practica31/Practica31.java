package practica31;

//Empelado

import java.util.Date;
import java.util.GregorianCalendar;

public class Practica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Empleado[] a = new Empleado[4];
        a[0]=new Empleado("Mario lopes",85000,1990,12,17);
        a[1]=new Empleado("Luisa ramos",95000,1995,06,02);
        a[2]=new Empleado("Maria Matinez",105000,2002,03,15);
        a[3]=new Empleado("Antonio Fernandez");
        for(Empleado s: a){
           s.sueldos(5); 
        }
         for(Empleado s: a){
           System.out.println("El nombre del empleado "+s.nombrea()+ " Sueldo "+ s.sueldoa()+ " Fecha "+s.fechac());
        }
    }
    
}
class Empleado{
    public Empleado(String nomb, double suel, int agno, int mes, int dia){
        nombre=nomb;
        sueldo=suel;
        GregorianCalendar cale = new GregorianCalendar(agno, mes-1,dia);
        altacontrato=cale.getTime();
    }
    public Empleado(String nom){
        nombre=nom;
    }
    public String nombrea(){
     return nombre;
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
    private String nombre;
    private double sueldo;
    private Date altacontrato;
   
    
}
 