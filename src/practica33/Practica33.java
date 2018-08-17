//herencias
package practica33;

import java.util.Date;
import java.util.GregorianCalendar;
public class Practica33 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        jefatura jefe=new jefatura("Juan",55000,2006,9,25); 
        jefe.estableceincentivo(2570);
        Empleado[] a = new Empleado[6];
        a[0]=new Empleado("Mario lopes",85000,1990,12,17);
        a[1]=new Empleado("Luisa ramos",95000,1995,06,02);
        a[2]=new Empleado("Maria Matinez",105000,2002,03,15);
        a[3]=new Empleado("Antonio garcia",15000,2006,01,25);
        a[4]=jefe;
        a[5]=new jefatura("Maria garcia",5500,1999,05,26);
        jefatura jefafinanzas=(jefatura)a[5];
        jefafinanzas.estableceincentivo(55000);
        
        for(Empleado s: a){
           s.sueldos(5); 
        }
         for(Empleado e: a){
           System.out.println("El nombre del empleado "+e.nombrea()+ " Sueldo "+ e.sueldoa()+ " Fecha "+e.fechac());
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

class jefatura extends Empleado{
     public jefatura(String nom, double sue, int agno, int mes, int dia){
     super(nom,sue,agno,mes,dia);
     }
     public void estableceincentivo(double b){
         incentivo=b;
     }
     public double dsueldo(){
         double sueldof=super.sueldoa();
         return sueldof+incentivo;
     }
    private double incentivo;
}
