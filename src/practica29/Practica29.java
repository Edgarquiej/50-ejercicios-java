package practica29;

//Empelado

import java.util.Date;
import java.util.GregorianCalendar;

public class Practica29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] a = new Empleado[3];
        a[0]=new Empleado("Mario lopes",85000,1990,12,17);
        a[1]=new Empleado("Luisa ramos",95000,1995,06,02);
        a[2]=new Empleado("Maria Matinez",105000,2002,03,15);
        
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
 